package exception_basic.custom_exception.BankApplication;

public class InsufficientFundsException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public InsufficientFundsException(String error)
	{
		super(error);
	}
	
}
