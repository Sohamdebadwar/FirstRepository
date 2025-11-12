package multithreading.ola_riding_app;

public class PaymentProcessing extends Thread 
{
	@Override
	public void run() 
	{
		System.out.println("Processing payment...");
		try 
		{
			Thread.sleep(2000);
			System.out.println("Payment successful!");
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
