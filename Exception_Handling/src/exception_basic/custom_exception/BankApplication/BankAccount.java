package exception_basic.custom_exception.BankApplication;

public class BankAccount implements Bank 
{
	private long accountNumber ;
	private double balance;
	
	public BankAccount(long accountNumber, double balance)
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	@Override
	public void deposite(double amount) 
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount Must Be Greater Than 0");
		}
		else
		{
			double newBalance = balance + amount;
			System.out.println("Deposit successful. New balance: "+newBalance);
			System.out.println("Deposit successful. ");
		}
	}

	@Override
	public void withdrawal(double amount) throws InsufficientFundsException 
	{
		if(amount < 0 || amount > balance)
		{
			throw new InsufficientFundsException("Amount Must Be Greater Than 0 Or Less Than Balance");
		}
		else
		{
			double newBalance = balance - amount;
			System.out.println("withdraw successful. New balance: "+newBalance);
			System.out.println("withdraw successful. ");
		}
		
	}

	
	 @Override
	    public void transfer(BankAccount toAccount, double amount)
	            throws AccountNotFoundException, InvalidAmountException, InsufficientFundsException {

	        if (toAccount == null) {
	            throw new AccountNotFoundException("Target account not found!");
	        }
	        if (amount <= 0) {
	            throw new InvalidAmountException("Invalid amount. Must be greater than 0.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient funds for transfer.");
	        }

	        this.balance -= amount;
	        toAccount.balance += amount;

	        System.out.println("Deposit successful. New balance: " + this.balance);
	        System.out.println("Transfer successful.");
	    }

	@Override
	public void applyForLoan(double amount)
	{
		if(amount <= 0)
		{
			throw new InvalidAmountException("Amount Must Be Greater Than 0");
		}
		else
		{
			double newBalance = balance + amount;
			System.out.println("Loan approved. New balance: "+newBalance);
		}
	}
}
