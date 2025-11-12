package exception_basic.CNFexception4_2;

public class ChildClass extends ParentClass
{
	@Override
	public void loadingClass(String className) throws IllegalArgumentException, ClassNotFoundException
	{
		 try {
	            
	            if (className == null || className.trim().isEmpty()) 
	            {
	                throw new IllegalArgumentException("Class name cannot be null or empty.");
	            }  
	            super.loadingClass(className);
	        } 
	    catch (ClassNotFoundException e) 
		    {
	            System.out.println("Error: Class not found - " + className);
	        } 
	    catch (IllegalArgumentException e) 
		 {
	            System.out.println("Error: " + e.getMessage());
	     }
	}
}
