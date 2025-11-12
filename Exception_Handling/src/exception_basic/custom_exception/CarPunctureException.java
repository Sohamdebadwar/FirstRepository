package exception_basic.custom_exception;

public class CarPunctureException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	public CarPunctureException()
	{
		super();
	}
	
	public CarPunctureException(String error)
	{
		super(error);
	}
}
