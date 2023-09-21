public class TestPassByReference
{
 public static void main(String[] args)
 {
 System.out.println("main : start");
 
 
 int[] ages ={10,11,12};
 
 for (int i=0;i<ages.length;i++)
 {
	System.out.println(ages[i]);
 }
 System.out.println("main :before calling the test method");
 
 test(ages);
 
 System.out.println("main :after calling the test method");
 
 
 for (int i=0; i<ages.length;i++)
 {
 System.out.println(ages[i]);
 }
 System.out.println("Main :End");
 
 
 }
 
 public static void test(int[] arr)
 {
 System.out.println("tets:start");
 
 for (int i=0;i<arr.length;i++)
 {
		arr[i]=i+50;
 }
 System.out.println("test :end");

 
 }
}