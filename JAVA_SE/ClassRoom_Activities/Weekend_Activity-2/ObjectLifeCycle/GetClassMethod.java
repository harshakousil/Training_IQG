public class GetClassMethod {
	
	public static void main(String[] args) {
	
	String str1 = "Life is worth living... with Passion!";
	
	Class str1Class = str1.getClass();
	
	System.out.println("Class of str1 object instance is " + str1Class);
	
	String str1ClassName = str1Class.getName();
	
	System.out.println("Class of str1 object instance is " + str1Class);
	
	Integer int1 = new Integer(34);
	
	Class int1Class = int1.getClass();
	
	System.out.println("Class of int1 object instance is " + int1Class);
	
	
	String int1ClassName = int1Class.getName();
	
	System.out.println("Class of int1 object instance is " + int1Class);
	}
}