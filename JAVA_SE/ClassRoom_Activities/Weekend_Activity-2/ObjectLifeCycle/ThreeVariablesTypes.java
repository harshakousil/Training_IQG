public class ThreeVariablesTypes {
	
	static String myStaticVariable = "static variable";
	
	String myInstanceVariable = "instance variable";
	
	public ThreeVariablesTypes() {
	}
	
	
	public static void main(String[] args) {
	
	String myLocalVariable = "local variable";
	ThreeVariablesTypes th = new ThreeVariablesTypes();
	
	System.out.println("myStaticVariable = " + myStaticVariable);
	
	System.out.println("myInstanceVariable = " + th.myInstanceVariable);
	
	System.out.println("myLocalVariable = " + myLocalVariable);
	
	}
}