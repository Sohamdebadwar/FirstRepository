package exception_basic.custom_exception.BankApplication;

public class AccountNotFoundException extends Exception
{

	private static final long serialVersionUID = 1L;

	public AccountNotFoundException()
	{
		super();
	}

	public AccountNotFoundException(String error)
	{
		super(error);
	}

}
