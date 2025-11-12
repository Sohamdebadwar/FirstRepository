package multithreading.internal_thread_communication;

public class Drawer extends Thread
{
	private Account account;

	public Drawer(Account account) 
	{
		super();
		this.account = account;
	}

	@Override
	public void run()
	{
		int []withdrawalAmt= {200,400,500};
		
		for(int amount:withdrawalAmt)
		{
			account.withdraw(amount);
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
