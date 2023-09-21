package Schedulers.Practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class SchedulerService {

    int count=0;

    //This function shows time from 11  to 11:59 for every minute.
    @Scheduled(cron = "0 * 12 * * ?")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + strDate);
    }


    //This function shows the count for every 5 secs

    @Scheduled(fixedRate = 5000)
    public void showcount()  {
        count++;
        //System.out.println("Current count is :" +count);
    }


    //This function prints the date for every 5 secs
    //Fixed dealy will excite this function after every other operations completed inside the function.
    @Scheduled(fixedDelay = 1000)
    public void printDate() throws InterruptedException
    {
         LocalDateTime date = LocalDateTime.now();
        //System.out.println("The current Date is "+date);
        Thread.sleep(5000);
    }

}