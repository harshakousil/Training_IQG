package Practice.JavaSE8;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Calculator calculator = ()->System.out.println("Calculator is switched on");
//        calculator.switchOn();

      //  Calculator calculator =(int input)-> System.out.println("The value is :"+input);
        //calculator.sum(200);

        Calculator calculator= (i, j)->
        {
            if(j>i)
            {
                throw new RuntimeException("Second value must be smaller than first value");
            }
            else {
                return  i-j;
            }
        };
        System.out.println(calculator.substract(10,1));

    }

}