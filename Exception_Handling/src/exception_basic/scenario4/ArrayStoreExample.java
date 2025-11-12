package exception_basic.scenario4;

public class ArrayStoreExample 
{
	public static void main(String[] args) 
	{
		ArrayStoreExample2.storeObjects();
	}
}

class ArrayStoreExample2 {
	public static void storeObjects() {
		try {
			Object []strings = new String[3];
			strings[0] = "Hello";   
		    strings[1] = "World";  
		    strings[2] = "java"; 
		   // strings[2] = 111; // throws exception
		    System.out.println("Objects stored successfully.");
			
		} 
		catch (ArrayStoreException e) 
		{
			  System.out.println("ArrayStoreException caught: Incompatible type: "
	                    + "java.lang.Integer cannot be stored in an array of java.lang.String");
		}
	}
}
