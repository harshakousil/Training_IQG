package training.iqgateway.springboot.SpringBootLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	
	Logger logger =LoggerFactory.getLogger(LoggingController.class);
	
	@RequestMapping("/")
	public String index()
	{
		logger.trace("A Trace Message");
		logger.debug("A Debug Message");
		logger.info("A Info Message");
		logger.warn("A Warning Message");
		logger.error("A Error Message");
		return "Hello Buddy ! Check out the Logs to see the Output....";
		
	}

}
