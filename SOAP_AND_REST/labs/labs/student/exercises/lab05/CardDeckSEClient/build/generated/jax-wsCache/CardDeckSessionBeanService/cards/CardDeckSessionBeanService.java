
package cards;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CardDeckSessionBeanService", targetNamespace = "http://ejbs/", wsdlLocation = "http://localhost:7001/CardDeckSessionBean/CardDeckSessionBeanService?wsdl")
public class CardDeckSessionBeanService
    extends Service
{

    private final static URL CARDDECKSESSIONBEANSERVICE_WSDL_LOCATION;
    private final static WebServiceException CARDDECKSESSIONBEANSERVICE_EXCEPTION;
    private final static QName CARDDECKSESSIONBEANSERVICE_QNAME = new QName("http://ejbs/", "CardDeckSessionBeanService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/CardDeckSessionBean/CardDeckSessionBeanService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CARDDECKSESSIONBEANSERVICE_WSDL_LOCATION = url;
        CARDDECKSESSIONBEANSERVICE_EXCEPTION = e;
    }

    public CardDeckSessionBeanService() {
        super(__getWsdlLocation(), CARDDECKSESSIONBEANSERVICE_QNAME);
    }

    public CardDeckSessionBeanService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CARDDECKSESSIONBEANSERVICE_QNAME, features);
    }

    public CardDeckSessionBeanService(URL wsdlLocation) {
        super(wsdlLocation, CARDDECKSESSIONBEANSERVICE_QNAME);
    }

    public CardDeckSessionBeanService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CARDDECKSESSIONBEANSERVICE_QNAME, features);
    }

    public CardDeckSessionBeanService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CardDeckSessionBeanService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CardDeckSessionBean
     */
    @WebEndpoint(name = "CardDeckSessionBeanPort")
    public CardDeckSessionBean getCardDeckSessionBeanPort() {
        return super.getPort(new QName("http://ejbs/", "CardDeckSessionBeanPort"), CardDeckSessionBean.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CardDeckSessionBean
     */
    @WebEndpoint(name = "CardDeckSessionBeanPort")
    public CardDeckSessionBean getCardDeckSessionBeanPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ejbs/", "CardDeckSessionBeanPort"), CardDeckSessionBean.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CARDDECKSESSIONBEANSERVICE_EXCEPTION!= null) {
            throw CARDDECKSESSIONBEANSERVICE_EXCEPTION;
        }
        return CARDDECKSESSIONBEANSERVICE_WSDL_LOCATION;
    }

}
