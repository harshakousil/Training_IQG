public class MyCompute
{
public static void main(String[] args)
{
System.out.println("I am reading numbers as command line arguments...");

if(args.length !=2)
{
	System.out.println("Please enter two numbers !");
	System.exit(0);
}
 int int1=Integer.parseInt(args[0]);
 int int2=Integer.parseInt(args[1]);
 int additionResult =int1 +int2;
 
 System.out.println("Result of addition =" + additionResult);
 
 
 
 int1=Integer.parseInt(args[0]);
 int2=Integer.parseInt(args[1]);
 int multiResult =int1 * int2;
 
 System.out.println("Result of addition =" + multiResult);
}
}