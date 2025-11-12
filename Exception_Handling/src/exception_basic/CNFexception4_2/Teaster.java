package exception_basic.CNFexception4_2;

public class Teaster {

	public static void main(String[] args)
	{
		 ChildClass child = new ChildClass();
		 
		 try {
	         if (args.length == 0) 
	         {
	                System.out.println("Please provide class name(s) as command line arguments.");
	                return;
	         }
	         
	         for (String className : args) 
	         {
	                child.loadingClass(className);
	          }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Unexpected error: " + e.getMessage());
		 }
}
}
