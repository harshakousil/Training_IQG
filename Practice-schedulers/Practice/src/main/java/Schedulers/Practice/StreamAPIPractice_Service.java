package Schedulers.Practice;

import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Component
public class StreamAPIPractice_Service {

    List<Integer> Nums= Arrays.asList(3,5,6,2,7,8);

    public void streamOperations()
    {
        System.out.println("Hello");
        Stream<Integer> data= Nums.stream()
                .map(n->n*n);
        data.forEach(System.out::println);
        Nums.forEach(System.out::println);
    }
}
