package javaserestclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.List;
import javax.ws.rs.core.MediaType;
import wlsmon.ArrayType;
import wlsmon.DataType;
import wlsmon.ObjectType;
import wlsmon.PropertyType;
import wlsmon.ValueType;

public class JavaSERestClient {

    public static void main(String[] args) {
        Authenticator authinstance = new Authenticator() {
            @Override
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("weblogic", "weblogic123".toCharArray());
            }
        };
        Authenticator.setDefault(authinstance);

        Client client = Client.create();
        String baseUrl = "http://localhost:7001/management/tenant-monitoring";
        WebResource webResource = client.resource(baseUrl);

        try {
            DataType dataType = webResource
                    .path("applications")
                    .accept(MediaType.APPLICATION_XML)
                    .get(DataType.class);
            printObjectType(dataType.getObject(), 0);
        } catch (UniformInterfaceException ex) {
            ex.printStackTrace();
        }

    }

    public static void printObjectType(ObjectType obj, int indentLevel) {
        List<PropertyType> properties = obj.getProperty();
        if (properties != null) {
            String indentStr = "";
            for (int i = 0; i < indentLevel; i++) {
                indentStr += "    ";
            }
            for (PropertyType pType : properties) {
                System.out.print(indentStr + pType.getName());
                if (pType.getValue() != null) {
                    ValueType valType = pType.getValue().getValue();
                    System.out.println("=" + valType.getValue());
                } else {
                    System.out.println("");
                }
                ArrayType arrType = pType.getArray();
                if (arrType != null) {
                    List<ObjectType> objList = arrType.getObject();
                    for (ObjectType obj2 : objList) {
                        printObjectType(obj2, indentLevel + 1);
                    }
                }
                ObjectType objType = pType.getObject();
                if (objType != null) {
                    printObjectType(objType, indentLevel + 1);
                }
            }
            System.out.println("");
        }
    }
}