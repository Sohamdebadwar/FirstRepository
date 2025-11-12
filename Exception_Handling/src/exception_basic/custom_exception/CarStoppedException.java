package exception_basic.custom_exception;

public class CarStoppedException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public CarStoppedException()
	{
		super();
	}
	
	public CarStoppedException(String error)
	{
		super(error);
	}
	
}
