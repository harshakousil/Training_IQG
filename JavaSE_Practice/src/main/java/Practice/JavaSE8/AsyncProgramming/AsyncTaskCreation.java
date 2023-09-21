package Practice.JavaSE8.AsyncProgramming;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class AsyncTaskCreation {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        //creating a  task using runnable interface and execute the task with completelablefuture
    Runnable myTask =()->
    {
        System.out.println("Task is running on Thread :" + Thread.currentThread().getName());

    };
    CompletableFuture<Void> test = CompletableFuture.runAsync(myTask);

        System.out.println(test);

    //creating a task using supplier interface instead of using  callable inteface  and excuting the task using completblae future
    Supplier<String> supplierTask =()->
    {
        return  "Using Supplier instead of Callable";
    };

    CompletableFuture<String> test1= CompletableFuture.supplyAsync(supplierTask);


        System.out.println(test1.get());

//    Chaining
//
//    Let’s now move on to how we can chain tasks of this initial stage and create pipelines.
//
//    There are four main methods:
//
//    thenRun()
//    thenAccept()
//    thenApply()
//    thenCompose()

//        There are also async versions of these:
//
//        thenRunAsync()
//        thenAcceptAsync()
//        thenApplyAsync()
//        thenComposeAsync()


}
}


