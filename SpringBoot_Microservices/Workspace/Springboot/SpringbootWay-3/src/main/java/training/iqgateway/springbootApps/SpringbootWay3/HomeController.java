package training.iqgateway.springbootApps.SpringbootWay3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hello")
	public String sayHello()
	{
		return "Welcome to REST controller From Spring Boot App....";
	}
	

}
