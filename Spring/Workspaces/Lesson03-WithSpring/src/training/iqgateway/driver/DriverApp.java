package training.iqgateway.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.CurrencyConverter;
import training.iqgateway.business.CurrencyConverterImpl;
import training.iqgateway.business.Customer;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Source Object Creation
//		Customer c1 = new Customer(1001,"Kousil","Vijayawada","90909090");
//		
//		
//		
//		
//		//target object Creation
//		CurrencyConverterImpl ccRef =new CurrencyConverterImpl();
//		
//		
//		//Setter level injection
//		ccRef.setCustomerRef(c1);
//		
//		System.out.println(ccRef.dollarToRS(1000));
		
		
		//Bringing Ioc Container into Action
		
		ApplicationContext appContext =new ClassPathXmlApplicationContext("/beans.xml");
		
		
		//We can lookup for beans instances
		
		CurrencyConverter ccRef =(CurrencyConverter) appContext.getBean("ccBean");
		
		
		//We can Invoke the business Logic
		
		System.out.println(ccRef.dollarToRS(1000));
	}

}
