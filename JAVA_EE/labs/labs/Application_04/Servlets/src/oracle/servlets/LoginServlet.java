package oracle.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";


    private static final String DB_URL ="jdbc:oracle:thin:@localhost:1521:XE";
    private static final String DB_USERNAME= "FOD";
    private static final String DB_PASSWORD ="FUSION";
    
    private static Connection con;
    private String pass;
    private String name;
    
    public void configureConnection() throws SQLException{
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);
            con.setAutoCommit(true);
            }
        catch(Exception e) {
            System.out.println("Connection failed :" +e.toString());
        }
        
        }
    
    public Connection getConnection() throws SQLException {
        configureConnection();
        return con;
    }
    protected boolean verifyPassword(String theUser, String password){
        String originalPassWord=null;
        try{
            con=getConnection();
            Statement stmt =con.createStatement();
            stmt.executeQuery("Select password from login where uname ='"+theUser+"'");
             ResultSet rs=stmt.getResultSet();
            if(rs.next()) {
                originalPassWord =rs.getString(1);
            }
            stmt.close();
            if(originalPassWord.equals(password)){
                return true;
            }
            else{
                return false;
            }
            
        }
        catch(Exception e){
            System.out.println("Exception in verifyPassword() =" +e.toString());
            return false;
        }
    }
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException,
                                                           IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>LoginServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
        out.println("</body></html>");
        out.close();
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException,
                                                            IOException {
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        
        name=request.getParameter("user_name");
        pass=request.getParameter("user_password");
        boolean result =verifyPassword(name,pass);
        out.println("<html>");
        out.println("<head><title>LoginServlet</title></head>");
        out.println("<body>");
        if(result == true) {
            out.println("Hello"+ name + ": Your login module is working great !");
        }
        else {
            out.println("Invalid user name or password");
        }
        out.println("</body></html>");
        out.close();
    }
}
