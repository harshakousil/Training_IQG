import javax.servlet.ServletContextListener;
import javax.servlet.ServletContextEvent;

public class AppLifeCycleEvent implements ServletContextListener {

  public void contextInitialized(ServletContextEvent cse) {
    System.out.println("Application initialized");

  }

  public void contextDestroyed(ServletContextEvent cse) {
    System.out.println("Application shut down");
  }
}