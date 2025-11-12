package exception_basic.custom_exception;

public class CarTest
{
	public static void stop(String message) throws CarStoppedException
	{
		if(message.toLowerCase().equals("stop"))
		{
			throw new CarStoppedException("Car stopped for some reason.");
		}
		else
		{
			System.out.println("Car not stalled.");
		}
	}
	
	public static void puncture(String message) throws CarPunctureException
	{
		if(message.toLowerCase().equals("puncture"))
		{
			throw new CarPunctureException("Car is punctured.");
		}
		else
		{
			System.out.println("Car not Punctured");
		}
	}
	
	public static void carHeat(int temp) throws CarHeatException
	{
		if(temp > 50)
		{
			throw new CarHeatException("Car is heated more than 50 degrees Celsius.");
		}
		else
		{
			System.out.println("Car temperature normal.");
		}
	}
}
