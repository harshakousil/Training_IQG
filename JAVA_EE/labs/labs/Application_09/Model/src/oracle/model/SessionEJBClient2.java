package oracle.model;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import javax.naming.NamingException;

import oracle.services.SessionEJB09Soln;

public class SessionEJBClient2 {
    public static void main(String [] args) {
        try {
            final Context context = getInitialContext();
            SessionEJB09Soln sessionEJB = (SessionEJB09Soln)context.lookup("SessionEJB09_Solution#oracle.services.SessionEJB09Soln");

            for (Product product : (List<Product>)sessionEJB.queryProductFindById( 1 )) {
                System.out.println( "additionalInfo = " + product.getAdditionalInfo() );
                System.out.println( "costPrice = " + product.getCostPrice() );
                System.out.println( "description = " + product.getDescription() );
                System.out.println( "externalUrl = " + product.getExternalUrl() );
                System.out.println( "listPrice = " + product.getListPrice() );
                System.out.println( "minPrice = " + product.getMinPrice() );
                System.out.println( "productId = " + product.getProductId() );
                System.out.println( "productName = " + product.getProductName() );
                System.out.println( "shippingClassCode = " + product.getShippingClassCode() );
                System.out.println( "supplierId = " + product.getSupplierId() );
                System.out.println( "warrantyPeriodMonths = " + product.getWarrantyPeriodMonths() );
                System.out.println( "category = " + product.getCategory() );
            }
            for (Product product : (List<Product>)sessionEJB.queryProductFindByName( "I%" )) {
                System.out.println( "additionalInfo = " + product.getAdditionalInfo() );
                System.out.println( "costPrice = " + product.getCostPrice() );
                System.out.println( "description = " + product.getDescription() );
                System.out.println( "externalUrl = " + product.getExternalUrl() );
                System.out.println( "listPrice = " + product.getListPrice() );
                System.out.println( "minPrice = " + product.getMinPrice() );
                System.out.println( "productId = " + product.getProductId() );
                System.out.println( "productName = " + product.getProductName() );
                System.out.println( "shippingClassCode = " + product.getShippingClassCode() );
                System.out.println( "supplierId = " + product.getSupplierId() );
                System.out.println( "warrantyPeriodMonths = " + product.getWarrantyPeriodMonths() );
                System.out.println( "category = " + product.getCategory() );
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
