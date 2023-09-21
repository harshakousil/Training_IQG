// Member Level Inner Classes
public class CompDetails 
{
	// Attributes
	private String compName = "Oracle";
	
	// Class Variables
	public static int ageLimit = 65;

	// Instance Method
	public void sayHello()
	{
		System.out.println(" Welcome to " + compName );
	}

	// Class Methods
	public static void Welcome()
	{
		System.out.println(" Welcome to Our Company Hope You Will Enjoy Working with US ");
	}

	public void accessInnerDetails()
	{
		Address addr = new Address();
		addr.displayAddress();
		System.out.println(addr.city);
	}

	private class Address 
	{
		private String city = " Manila";
		private String area = " Langford Garden";

		public void displayAddress()
		{
			System.out.println("Name : "+ compName);
			System.out.println("Area : " + area);	
			System.out.println("City : " + city);
			System.out.println(ageLimit);
			sayHello();
			Welcome();
		}
	}
	
	public static void main(String[] args) 
	{
		CompDetails CD_Obj = new CompDetails();

						// ObjRef.methodName();
		Address addrObj = CD_Obj.new Address();

		addrObj.displayAddress();

	}
}
