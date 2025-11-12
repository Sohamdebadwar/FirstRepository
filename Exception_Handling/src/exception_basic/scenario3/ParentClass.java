package exception_basic.scenario3;

public class ParentClass 
{
	public void loadingClass(String className) throws ClassNotFoundException
	{
		Class<?> cls = Class.forName(className);
		System.out.println("Class loaded successfully: "+cls.getName());
	}
}