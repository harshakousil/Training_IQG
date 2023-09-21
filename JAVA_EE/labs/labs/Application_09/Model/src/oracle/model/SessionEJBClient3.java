package oracle.model;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.naming.NamingException;

import oracle.services.SessionEJB09Soln;

public class SessionEJBClient3 {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            SessionEJB09Soln sessionEJB = (SessionEJB09Soln)context.lookup("SessionEJB09_Solution#oracle.services.SessionEJB09Soln");

            for (Category category : (List<Category>)sessionEJB.queryCategoryFindRoot()) {
                System.out.println( "categoryDescription = " + category.getCategoryDescription() );
                System.out.println( "categoryId = " + category.getCategoryId() );
                System.out.println( "categoryLockedFlag = " + category.getCategoryLockedFlag() );
                System.out.println( "categoryName = " + category.getCategoryName() );
                System.out.println( "productList = " + category.getProductList() );
                System.out.println( "parent = " + category.getParent() );
                System.out.println( "children = " + category.getChildren() );
            }
            for (Category category : (List<Category>)sessionEJB.queryCategoryFindLeaf()) {
                System.out.println( "categoryDescription = " + category.getCategoryDescription() );
                System.out.println( "categoryId = " + category.getCategoryId() );
                System.out.println( "categoryLockedFlag = " + category.getCategoryLockedFlag() );
                System.out.println( "categoryName = " + category.getCategoryName() );
                System.out.println( "productList = " + category.getProductList() );
                System.out.println( "parent = " + category.getParent() );
                System.out.println( "children = " + category.getChildren() );
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
