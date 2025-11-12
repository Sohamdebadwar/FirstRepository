package exception_basic.custom_exception;

import java.util.Scanner;

public class CarUser
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.println("enter car stop / go ");
			String stop = sc.nextLine();
			CarTest.stop(stop);
			
			System.out.println("enter car puncture / move ");
			String punct = sc.nextLine();
			CarTest.puncture(punct);
			
			System.out.println("enter car tempucture ");
			int temp = Integer.parseInt(sc.nextLine());
			CarTest.carHeat(temp);
		} 
		catch (CarStoppedException | CarPunctureException | CarHeatException e) 
		{
			if(e instanceof CarStoppedException)
			{
				System.out.println(e);
			}
			else if(e instanceof CarPunctureException)
			{
				System.out.println(e);
			}
			else
			{
				System.out.println(e);
			}
		}
	}
}
