
package calc;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6hudson-86 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalculatorWSService", targetNamespace = "http://calculator.me.org/", wsdlLocation = "META-INF/wsdls/CalculatorWSService.wsdl")
public class CalculatorWSService
    extends Service
{

    private final static URL CALCULATORWSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(calc.CalculatorWSService.class.getName());
    private final static QName CALCULATORWSSERVICE_QNAME = new QName("http://calculator.me.org/", "CalculatorWSService");

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = calc.CalculatorWSService.class.getResource(".");
            url = new URL(baseUrl, "META-INF/wsdls/CalculatorWSService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'META-INF/wsdls/CalculatorWSService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CALCULATORWSSERVICE_WSDL_LOCATION = url;
    }

    public CalculatorWSService() {
        super(CALCULATORWSSERVICE_WSDL_LOCATION, CALCULATORWSSERVICE_QNAME);
    }

    public CalculatorWSService(WebServiceFeature... features) {
        super(CALCULATORWSSERVICE_WSDL_LOCATION, CALCULATORWSSERVICE_QNAME, features);
    }

    public CalculatorWSService(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORWSSERVICE_QNAME);
    }

    public CalculatorWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORWSSERVICE_QNAME, features);
    }

    public CalculatorWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorWS
     */
    @WebEndpoint(name = "CalculatorWSPort")
    public CalculatorWS getCalculatorWSPort() {
        return super.getPort(new QName("http://calculator.me.org/", "CalculatorWSPort"), CalculatorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorWS
     */
    @WebEndpoint(name = "CalculatorWSPort")
    public CalculatorWS getCalculatorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://calculator.me.org/", "CalculatorWSPort"), CalculatorWS.class, features);
    }

}
