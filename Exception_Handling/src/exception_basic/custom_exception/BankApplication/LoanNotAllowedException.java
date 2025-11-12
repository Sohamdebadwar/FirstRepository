package exception_basic.custom_exception.BankApplication;

public class LoanNotAllowedException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	public LoanNotAllowedException() {
		super();
	}

	public LoanNotAllowedException(String error) {
		super(error);
	}


}
