package exception_basic.custom_exception.BankApplication;

public class InvalidAmountException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
	public InvalidAmountException() 
	{
		super();
	}
	
	public InvalidAmountException(String error) 
	{
		super(error);
	}
}
