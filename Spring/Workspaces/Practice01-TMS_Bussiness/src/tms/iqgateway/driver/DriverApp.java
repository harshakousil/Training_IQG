package tms.iqgateway.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tms.iqgateway.bussiness.AdminOperations;
import tms.iqgateway.bussiness.AdminOperationsImpl;
import tms.iqgateway.entities.RoleEO;


public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Bringing Ioc Container into Action
		
		ApplicationContext appContext =new ClassPathXmlApplicationContext("/beans.xml");
		
		
		//We can lookup for beans instances
		
		AdminOperationsImpl ccRef =(AdminOperationsImpl) appContext.getBean("AdminOperationsBean");
		
		
		//We can Invoke the business Logic
		
		System.out.println(ccRef.addRole());
	}

}
