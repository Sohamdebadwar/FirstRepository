package multithreading.ola_riding_app;

public class LiveTracking extends Thread
{
	@Override
	public void run() 
	{
		try 
		{
			System.out.println("Updating ride location... 20% completed");
			Thread.sleep(1000);
			System.out.println("Updating ride location... 40% completed");
			Thread.sleep(1000);
			System.out.println("Updating ride location... 60% completed");
			Thread.sleep(1000);
			System.out.println("Updating ride location... 80% completed");
			Thread.sleep(1000);
			System.out.println("Updating ride location... 100% completed");
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
