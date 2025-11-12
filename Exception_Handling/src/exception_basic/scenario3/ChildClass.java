package exception_basic.scenario3;

public class ChildClass extends ParentClass
{
	@Override
	public void loadingClass(String className)
	{
		try
		{
			if(className == null || className.trim().isEmpty())
			{
				throw new IllegalArgumentException("Class name cannot be empty");
			}
			 super.loadingClass(className);
			
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
			 throw new RuntimeException("Unchecked Exception: RuntimeException from ChildClass");
		}
		
	}
}
