package multithreading.internal_thread_communication;

public class Depositor extends Thread
{
	private Account account;

	public Depositor(Account account) 
	{
		super();
		this.account = account;
	}

	@Override
	public void run()
	{
		int []depositeAmt= {300,1000,600};
		
		for(int amount:depositeAmt)
		{
			account.deposite(amount);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
