import java.io.FileInputStream;
import java.util.Properties;

public class SetSystemProperties {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream propFile = new FileInputStream("myProperties.txt");
		
		Properties p = new Properties(System.getProperties());
		
		p.load(propFile);
		
		// set a property through setProperty() method
		
		p.setProperty("myKey1", "myValue1");
		
		// set the system properties
		
		System.setProperties(p);
		
		// display new properties
		
		System.getProperties().list(System.out);
	}
}