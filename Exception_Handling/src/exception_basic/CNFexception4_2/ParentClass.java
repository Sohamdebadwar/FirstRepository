package exception_basic.CNFexception4_2;

public class ParentClass 
{
	public void loadingClass(String clssName) throws ClassNotFoundException
	{
		Class<?> cls = Class.forName(clssName);
		System.out.println("Clss "+cls.getName()+"loaded Successfully.");
	}
}
