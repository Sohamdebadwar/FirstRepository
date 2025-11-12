package exception_basic.scenario3;

public class Tester
{
	public static void main(String[] args) 
	{
		 ChildClass child = new ChildClass();
		 try 
		 {
	            if (args.length == 0) 
	            {
	                System.out.println("Please provide a class name as a command-line argument.");
	                return;
	            }

	            String input = args[0];
	            child.loadingClass(input);

	     } 
		 catch (IllegalArgumentException e)
		 {
	            System.out.println("Exception caught: " + e.getMessage());
	     } 
		 catch (RuntimeException e)
		 {
	            System.out.println("Exception caught: " + e.getMessage());
	     }
	 }
}
