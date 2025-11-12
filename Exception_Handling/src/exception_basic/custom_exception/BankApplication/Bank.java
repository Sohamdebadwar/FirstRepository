package exception_basic.custom_exception.BankApplication;

public interface Bank 
{
	public abstract void deposite(double amount);
	public abstract void withdrawal(double amount) throws InsufficientFundsException ;
	public abstract void transfer(BankAccount toAccount,double amount) throws AccountNotFoundException, InvalidAmountException, InsufficientFundsException ;
	public abstract void applyForLoan (double amount);
}
