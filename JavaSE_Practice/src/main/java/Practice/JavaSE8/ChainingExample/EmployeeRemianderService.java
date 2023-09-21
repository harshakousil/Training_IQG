package Practice.JavaSE8.ChainingExample;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class EmployeeRemianderService {

    public CompletableFuture<Void>  sendRemainderToEmployee()
    {
       CompletableFuture<Void> voidCompletableFuture= CompletableFuture.supplyAsync(()->{
            System.out.println("fecthEmployee :" + Thread.currentThread().getName());
            return  EmployeeDatabase.fetchEmployees();
        }).thenApply((employees)->{
            System.out.println("Filter New Joiner Employee :" + Thread.currentThread().getName());
            return  employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getNewJoiner()))
                    .collect(Collectors.toList());
        }).thenApply((employees)->{
            System.out.println("training pending for New Joiner Employee :" + Thread.currentThread().getName());
            return employees.stream()
                    .filter(employee -> "TRUE".equals(employee.getLearningPending()))
                    .collect(Collectors.toList());

        }).thenApply((employees)->
        {
            System.out.println("Getting  new Joiner employee Emails whose training is pending:" + Thread.currentThread().getName());
           return employees.stream()
                    .map(Employee::getEmail).collect(Collectors.toList());

        }).thenAccept((emails)->
        {
            System.out.println("Sending Emails to Employeers whose training is pending:" + Thread.currentThread().getName());
            emails.forEach(EmployeeRemianderService::sendEmail);
         });
       return  voidCompletableFuture;
    }

    public static  void sendEmail(String email)
    {
        System.out.println("Sending pending remainder email to : "+email);
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        EmployeeRemianderService service = new EmployeeRemianderService();
        service.sendRemainderToEmployee().get();
    }
}
