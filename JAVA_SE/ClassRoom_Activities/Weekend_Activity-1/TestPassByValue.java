public class TestPassByValue
{
 public static void main(String args[])
 {
 
 int i=10;
 
 System.out.println("Start of the ,main method and i = " +i);
 
 
 test(i);
 
 
 System.out.println("End of the main Method and i ="+ i);
 }
 public static void test(int j)
 {
  System.out.println("start of the test method and j = "+j);
  
   j=33;
  System.out.println("end of the test method and j= " +j);
  
 }
 
 
 
}