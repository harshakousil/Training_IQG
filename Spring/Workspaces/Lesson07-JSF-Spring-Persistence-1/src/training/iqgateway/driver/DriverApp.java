package training.iqgateway.driver;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.iqgateway.business.AdminOperations;
import training.iqgateway.entities.DepartmentEO;

public class DriverApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory beanFactoryRef =new ClassPathXmlApplicationContext("/Application-context.xml");
		
		
		AdminOperations adminOperRef =(AdminOperations) beanFactoryRef.getBean("adminOperBean");
		
		//DepartmentEO deptEO =new DepartmentEO(340, "New Finance",100,1700);
		
//		Integer result =adminOperRef.addDepartment(deptEO);
//		System.out.println(result);
//		
//		List<DepartmentEO> returnedList= adminOperRef.fecthAllDepartments();
//		
//		for (DepartmentEO departmentEO : returnedList) {
//			System.out.println(departmentEO);
//		}
		
List<DepartmentEO> returnedList= adminOperRef.fecthDepartmentsBasedonLocation(1700);
		
		for (DepartmentEO departmentEO : returnedList) {
			System.out.println(departmentEO);
		}
	}

}
