package exception_basic.scenario2;

import java.util.Scanner;

public class PerformDivision 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter dividend : ");
		int dividend = sc.nextInt();
		System.out.print("Enter divisior : ");
		int divisior = sc.nextInt();
		
		try
		{
		int result = DivisionExample.performDivision(dividend,divisior);
		System.out.println("Result of division : "+result);
		}
		catch(ArithmeticException e)
		{
			System.err.println("ArithmeticException caught: Division by zero: dividend="+dividend+", divisor="+divisior);
		}
	}
}
