import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

public class SessionLifeCycleEventDemo 
  implements ServletContextListener, HttpSessionListener {
  ServletContext servletContext;
  int counter;
  public void contextInitialized(ServletContextEvent sce) {
    servletContext = sce.getServletContext();
    servletContext.setAttribute(("userCounter"), Integer.toString(counter));
  }

  public void contextDestroyed(ServletContextEvent sce) {
  }

  public void sessionCreated(HttpSessionEvent hse) {
    System.out.println("Session created.");
    incrementUserCounter();
  }

  public void sessionDestroyed(HttpSessionEvent hse) {
    System.out.println("Session destroyed.");
    decrementUserCounter();
  }

  synchronized void incrementUserCounter() {
    counter = Integer.parseInt(
      (String)servletContext.getAttribute("userCounter"));
    counter++;
    servletContext.setAttribute(("userCounter"), Integer.toString(counter));
    System.out.println("User Count: " + counter);
  }

  synchronized void decrementUserCounter() {
    int counter = Integer.parseInt(
      (String)servletContext.getAttribute("userCounter"));
    counter--;
    servletContext.setAttribute(("userCounter"), Integer.toString(counter));
    System.out.println("User Count: " + counter);
  }
}
