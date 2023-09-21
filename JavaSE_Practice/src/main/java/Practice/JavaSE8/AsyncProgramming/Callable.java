package Practice.JavaSE8.AsyncProgramming;

@FunctionalInterface
public interface Callable<V> {

//    callable interface returns the result  and throws the excution time exceptions
    V Call() throws Exception;
}
