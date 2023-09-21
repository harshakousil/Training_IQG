import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ApplicationEventDemoServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) 
    throws ServletException, IOException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println("<HTML>");
    out.println("<HEAD>");
    out.println("<TITLE>Application Event Demo Servlet</TITLE>");
    out.println("</HEAD>");
    out.println("<BODY>");
    out.println("Your database connection is ");

    // get the ServletContext object
    ServletContext servletContext = getServletContext();
    // display the "dbUrl" attribute
    java.sql.Connection con=(java.sql.Connection)servletContext.getAttribute("ConObj"));
	
	
    out.println("</BODY>");
    out.println("</HTML>");
  }
}
