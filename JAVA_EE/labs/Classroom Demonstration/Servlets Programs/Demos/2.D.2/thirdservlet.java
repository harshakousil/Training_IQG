import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.*;
import java.util.Calendar;
import javax.sql.*;
import java.sql.*;
public class thirdservlet extends HttpServlet
{
String accountnumber;
Connection dbcon;       
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
// Establishing the connection with the database
//-----------------------------------------------
	try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			dbcon=DriverManager.getConnection("jdbc:odbc:servletcomm","sa","password");
			System.out.println("connection est");
			
			}catch(ClassNotFoundException e)
			{
			System.out.println("Database driver not found");
			System.out.println(e.toString());
			throw new UnavailableException(this, "Cannot connect to the database");
                 	}
			catch (Exception e)
			{
			System.out.println("UNKNOWN!?");
			} // end catch
//----------------------------------------------------


// Accessing the accout number from the servlet context
ServletContext context = getServletContext();
Object obj = context.getAttribute("accountnumber");
String accnum=obj.toString();

PrintWriter out=res.getWriter();

res.setContentType("text/html");
out.println("<html>");
out.println("<body bgcolor=pink>");
String amount=req.getParameter("amount");
// Getting the cheque number from the form
//----------------------------------------
String checknum=req.getParameter("checknum");
// checking if the checknumber is empty
// ------------------------------------
boolean checkcorrect,amountcorrect;
checkcorrect=true;
amountcorrect=true;
if (checknum.length()==0)
{
  checkcorrect=false;
  out.println("Pls enter the cheque number properly");
} 

String name=new String();
Double temp=Double.valueOf(amount);
double mdeposit=temp.doubleValue();
if (mdeposit <=0 )
{
 amountcorrect=false;
 out.println("The deposit amount must be valid");
 out.println("<br>");
 out.println("Pls reenter the amount");
}
if (checkcorrect && amountcorrect)
{

// inserting the data in the Account_Holder_Transaction
//-----------------------------------------------------
// the date of transaction has been set to accepts the default date in SQL



// The value of vcParticulars is taken as Cheque deposit in this program
//----------------------------------------------------------------
String vcparticulars=new String("Cheque Deposit");
// This value needs to be picked up from the account_holder table and inserted with every transaction that the customer makes
double balance=0.0;

//Inserting the details into the Account_Holder_Transaction table
//---------------------------------------------------------------

try
{

	     PreparedStatement s=dbcon.prepareStatement("insert Account_Holder_Transaction values(?,sysdate(),?,?,?)");
           s.setString(1,accnum);
           s.setString(2,vcparticulars);
           s.setString(3,checknum);
	     s.setDouble(4,mdeposit);
	     int rows=s.executeUpdate();
           try
	     {
			dbcon.close();
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
              
		if (rows==0)
		{
                    
			  System.out.println("Error inserting rows in the Account-Holder-Transaction table");
		}
		else
		{
                    out.println("Your transaction details have been recorded.");
                    out.println("<br>");
                    out.println("Click the report button to view the last 20 transactions that were made.");
                    out.println("<br>");
                    out.println("<form method =post action='/servlet/fourthservlet'>");
                    out.println("<input type=submit value=Report>");
                    out.println("</form>");                  
			  System.out.println("The values have been successfully inserted in the Account_Holder_Table");
		}

} //end try
catch (Exception e)
{
   System.out.println(e.toString());
}
out.println("</BODY>");
out.println("</HTML>");
out.close();
}
  
} // End doPost
} // End class definition



    