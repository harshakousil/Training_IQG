public class StaticAndInstanceMethods{


public static void main(String args[])
{
 String strInstance1 =new String("I am object instance of a String Class");
 String strInstance2 = "Live your passion !";
 char x=strInstance1.charAt(2);
 char y=strInstance2.charAt(1);
 char z=strInstance2.charAt(0);
 
 System.out.println("The 3rd char of strInstance1 = " +x);
 System.out.println("The 2nd char of strInstance2 = " +y);
  System.out.println("The 1st char of strInstance2 = " +z);
  
  
  boolean b = strInstance1.equalsIgnoreCase(strInstance2);
 
 String strInstance3= b? "yes":"No";

System.out.println("Do strInstance1 and strInstance2 have same String ingorinf case ? "+strInstance3);

int i=23;
String strInstance4=String.valueOf(i);
System.out.println("Value of Instance4 = " +strInstance4);

String strInstance5 = new String ("34");

int ii =Integer.parseInt(strInstance5);
System.out.println("Value of ii =" + ii);

// invoke a instance method through a class.

char f =String.charAt(2);
}



}
