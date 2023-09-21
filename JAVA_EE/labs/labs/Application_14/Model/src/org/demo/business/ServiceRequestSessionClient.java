package org.demo.business;

import java.util.Hashtable;
import org.demo.business.ServiceRequestSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ServiceRequestSessionClient {
    
    public static void confirmByEmail(ServiceRequestSession message){
        System.out.println(" ***  confirm Email requested for Service Request Id : \"SKING11296\"");
        try{
            String from ="support@srdemo.org";
            String to="steve.king@srdemo.org";
            String subject ="Notification :OrderId #SKING11296 created";
            String msgText ="<html>"+
                "<body>"+
                "<h2>OrderID #SKING11296 created</h2>"+
                "<p>Dear steve,<p>"+
                "<p>Thanks for submitting the order. Your Ordered has been entered into our System, and will be processed in a couple of days.</p>"+
                "</body></html>";
            System.out.println("***  before sendMailMessage ");
            message.sendMailMessage(from,to,subject,msgText);
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            ServiceRequestSession serviceRequestSession = (ServiceRequestSession)context.lookup("ServiceRequestSessionEJB#org.demo.business.ServiceRequestSession");
            confirmByEmail(serviceRequestSession);
            System.out.println("Mail Sent....");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://localhost:7101");
        return new InitialContext( env );
    }
}
