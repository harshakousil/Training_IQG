package Practice.JavaSE8.AsyncProgramming;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class TaskCreation {

    public static void main(String[] args) {
        //creating the task using Runnable interface
    //old  fashion way of implementing the runnable interface
    Runnable task1= new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello from old fashion way");
        }
    };
    // New way of creating a  task using lambda expressions
    Runnable usingLambda = ()->
    {
        System.out.println(" hello from Lambda expression");
    };

    //old fashion way of creating a  task uins callable interface
    Callable getUserNameTask = new Callable() {
        @Override
        public String Call() throws Exception {
            return "Kousil";
        }
    };
    Callable getUserNameLastLambda = ()->{
        return  "Lakkapragada";
    };

    //Executing the  tasks
//        Thread myThread= new Thread(task1);
//        myThread();



        //Created single threaded executor
        ExecutorService executorService = Executors.newSingleThreadExecutor();


        //Runnable example
        executorService.submit(()->
            {
                System.out.println("Executing task using threads : " + Thread.currentThread().getName());
            });

        //callable Example
        Future<String> value = executorService.submit(()->{
            return("Callable returning string from thread"+ Thread.currentThread().getName());
        });

        System.out.println(value.isDone());
        System.out.println(value.cancel(false));
        System.out.println(value.isCancelled());



    }


}

