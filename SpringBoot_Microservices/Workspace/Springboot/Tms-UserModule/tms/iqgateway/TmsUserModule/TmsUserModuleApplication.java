package tms.iqgateway.TmsUserModule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TmsUserModuleApplication implements CommandLineRunner  {

	
	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(TmsUserModuleApplication.class, args);
	}

	public void run(String... args) throws Exception {
		
		//creating new user and saving it
		

			//UserEO usereo = new UserEO("yash","clerk","Admin");
		
//	//userService.addUser(usereo);
//			
//		//	userService.deleteUser("john_doe");
//			userService.modifyUser(usereo);
//	
//			
//	List<UserEO> userEo = userService.getAllUsers();
//
//	// Check if the list is not empty before proceeding
//	if (!userEo.isEmpty()) {
//	    for (UserEO user : userEo) {
//	       // System.out.println("User ID: " + user.getUserId());
//	        System.out.println("Username: " + user.getUsername());
//	        System.out.println("Password: " + user.getPassword());
//	        System.out.println("Role Name: " + user.getRoleName());
//	        System.out.println("--------------------------");
//	    }
//	} else {
//	    System.out.println("No users found.");
//	}
//
//		
//		
//		System.out.println(userService.getByUserName("yash"));
//			System.out.println("Im reaching here....");
//			try{
//			System.out.println(userService.deleteUser("Raone"));
//			}catch(Exception e){
//				e.printStackTrace();
//			}
			
		
		
			
		//System.out.println(userService.LoginValidation("yash","clerk"));
		System.out.println(userService.getAllRoles());
	}
}



