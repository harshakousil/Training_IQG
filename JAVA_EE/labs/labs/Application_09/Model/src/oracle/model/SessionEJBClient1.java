package oracle.model;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.naming.NamingException;

import oracle.services.SessionEJB09Soln;

public class SessionEJBClient1 {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            SessionEJB09Soln sessionEJB = (SessionEJB09Soln)context.lookup("SessionEJB09_Solution#oracle.services.SessionEJB09Soln");
            for (Person person : (List<Person>)sessionEJB.queryPersonFindById( 106 )) {
                System.out.println( "id = " + person.getId() );
                System.out.println( "firstName = " + person.getFirstName() );
                System.out.println( "lastName = " + person.getLastName() );
                System.out.println( "email = " + person.getEmail() );
                System.out.println( "phoneNumber = " + person.getPhoneNumber() );
            }
            for (Person person : (List<Person>)sessionEJB.queryPersonFindByLastName( "A%" )) {
                System.out.println( "id = " + person.getId() );
                System.out.println( "firstName = " + person.getFirstName() );
                System.out.println( "lastName = " + person.getLastName() );
                System.out.println( "email = " + person.getEmail() );
                System.out.println( "phoneNumber = " + person.getPhoneNumber() );
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Context getInitialContext() throws NamingException {
        Hashtable env = new Hashtable();
        // WebLogic Server 10.x connection details
        env.put( Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory" );
        env.put(Context.PROVIDER_URL, "t3://127.0.0.1:7101");
        return new InitialContext( env );
    }
}
