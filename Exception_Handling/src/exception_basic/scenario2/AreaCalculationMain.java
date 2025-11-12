package exception_basic.scenario2;

import java.util.Scanner;

public class AreaCalculationMain
{
	public static void main(String []args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			double length = sc.nextDouble();
			double width = sc.nextDouble();

			double area = AreaCalculator.calculateArea(length,width);
			System.out.println(area);
		}
		catch(IllegalStateException e)
		{
			System.err.println("Error: "+e);
		}
	}
}

class AreaCalculator
{
	public static double calculateArea(double length,double width)
	{
		 if (length <= 0 || width <= 0)
		 {
	         throw new IllegalArgumentException("Length and width must be > 0.");
	     }
		return length * width;
	}
}