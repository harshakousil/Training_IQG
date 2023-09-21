package myaccessmodifierexampleproject;
public class Main {

	public Main() {
	}
	public static void main(String[] args) {
	DummyClass t = new DummyClass();
	
	System.out.println("s1 = " + t.s1); 
	
	System.out.println("s2 = " + t.s2);
	System.out.println("s3 = " + t.s3);
	System.out.println("s4 = " + t.s4); 
	
	t.method1(); 
	t.method2(); 
	t.method3(); 
	t.method4(); 
	}
}