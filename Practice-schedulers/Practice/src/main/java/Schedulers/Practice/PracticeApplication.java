package Schedulers.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
@EnableScheduling
public class PracticeApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}


}
