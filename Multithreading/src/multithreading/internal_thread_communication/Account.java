package multithreading.internal_thread_communication;

public class Account
{
	private int balance = 0;

	public synchronized void withdraw(int amount)
	{
		while(amount > this.balance)
		{		
			try 
			{
				wait();
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		this.balance = this.balance - amount;
		System.out.println("balance after withdraw is :"+this.balance);
	}
	
	public synchronized void deposite(int amount)
	{
		this.balance = this.balance + amount;
		System.out.println("balance after deposite is :"+this.balance);
		notifyAll();
		
	}
}

