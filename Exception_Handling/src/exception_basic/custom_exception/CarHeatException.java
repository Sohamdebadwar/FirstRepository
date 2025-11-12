package exception_basic.custom_exception;

public class CarHeatException extends Exception 
{
	private static final long serialVersionUID = 1L;
	
	public CarHeatException()
	{
		super();
	}
	
	public CarHeatException(String error)
	{
		super(error);
	}
}

