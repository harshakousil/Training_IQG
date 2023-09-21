package tms.admin.module;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SixamApplication implements CommandLineRunner {
	
	@Autowired
	RoleService roleServiceRef;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SixamApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		RoleEO roleEO  = new RoleEO("TRAINER","Give Training on  Driving");
//		roleServiceRef.addRole(roleEO);
		
//		roleServiceRef.deleteRole("TRAINER");
		
//		RoleEO roleByNAme= roleServiceRef.getRole("CLERK");
//		System.out.println(roleByNAme);
//		
		
//		 int res = roleServiceRef.modifyRole(roleEO.getRoleName(),roleEO.getRoleDescription());
//		System.out.println(res);
		
//		deptServiceRef.getDepartmentByName("IT");
		

	}

}
