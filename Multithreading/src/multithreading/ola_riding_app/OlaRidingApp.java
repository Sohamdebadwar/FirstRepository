package multithreading.ola_riding_app;

public class OlaRidingApp 
{
	public static void main(String[] args) throws InterruptedException
	{
		RideRequest t1 = new RideRequest();
		DriverAssignment t2 = new DriverAssignment();
		FareCalculation t3 = new FareCalculation();
		LiveTracking t4 = new LiveTracking();
		PaymentProcessing t5 = new PaymentProcessing();
		RatingSystem t6 = new RatingSystem();
		
		t1.start();
		Thread.sleep(10);
		t3.start();
		t2.start();
		t2.join();
		t4.start(); 
		t4.join();
		t5.start();
		t5.join();
		t6.start();
		
	}
}
