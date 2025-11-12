package multithreading.ola_riding_app;

public class RideRequest extends Thread
{
	@Override
	public void run() 
	{
		System.out.println("User requested a ride...");
		try
		{
			Thread.sleep(2000);
			System.out.println("Searching for nearby drivers...");
			
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
