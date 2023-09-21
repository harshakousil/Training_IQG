public class HelloCommandLineArguments
{
 public static void main (String[] args)
 {
		System.out.println("I am saying Hello to the people below ...");
		
		if(args.length ==0)
		{
			System.exit(0);
		}
			
		for(int i=0;i<args.length;i++)
		{
			System.out.println("argument index "+ i +": "+ args[i]);
			
		}
 }
 }