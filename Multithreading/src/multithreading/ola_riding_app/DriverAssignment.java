package multithreading.ola_riding_app;

public class DriverAssignment extends Thread 
{
	@Override
	public void run()
	{
		try 
		{
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
}
