package expetion_basic;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the in Stirng Formate");
		String number = sc.next();
		handleExceptions(number);
		
		
	}
	
	public static void handleExceptions(String s)
	{
		try
		{
			System.out.println("Length of the input string: "+s.length());
			int num = Integer.parseInt(s);
			
		}
		catch(NumberFormatException | NullPointerException e)
		{
			if(e instanceof NumberFormatException)
			{
				System.err.println(e+" :Input is not a valid integer.");
			}
			else if(e instanceof NullPointerException)
			{
				System.err.println(e+" Input is null.");
			}
			else
			{
				System.out.println("Exception in Not Found");
			}
		}
	}
}
