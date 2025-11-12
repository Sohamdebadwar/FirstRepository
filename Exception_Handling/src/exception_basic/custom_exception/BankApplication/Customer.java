package exception_basic.custom_exception.BankApplication;

public class Customer 
{
	private String name;
	private BankAccount acc1;
	
	public Customer(String name, BankAccount acc1) 
	{
		super();
		this.name = name;
		this.acc1 = acc1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getAcc1() {
		return acc1;
	}

	public void setAcc1(BankAccount acc1) {
		this.acc1 = acc1;
	}
	
	
	

}
