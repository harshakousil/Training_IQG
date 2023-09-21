package Schedulers.Practice;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

@Component
public class SchedulerWithTimeZoneService {

   // private String timeZone= String.valueOf(TimeZone.getTimeZone("North America"));

    private  String   ZoneId= "UTC";

   // private static final String Timezone = String.valueOf(TimeZone.getTimeZone(ZoneId));

    @Scheduled(cron = "* * 9-10 * * *", zone = "Asia/Kolkata")
    public void midnightscheduler() {
        System.out.println("Displaying the  current Date and Time : "+ new Date());
    }
}
