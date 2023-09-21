public class ScopeOfVariable
{
 
 public static void main(String[] args)
 {
  int var1=10;
  int var2=0;
  
  if(var1<100)
  {
	var2=20;
  }
  else
  {
	var2=21;
  }
  
  System.out.println("Value of var1= " +var1);
  
  System.out.println("Value of var2 = " +var2);
 }
}