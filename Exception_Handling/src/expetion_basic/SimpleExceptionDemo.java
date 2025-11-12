package expetion_basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo 
	{
		public static void main(String[] args) 
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter the first integer (a): ");
				int num1 = sc.nextInt();
				System.out.println("Enter the second integer (b): ");
				int num2 = sc.nextInt();
				
			}
			catch(InputMismatchException e)
			{
				System.err.println(e.getMessage());
				System.err.println(e.toString());
				System.err.println("InputMismatchException occurred. Please enter only integer numbers.");
				e.printStackTrace();
				
			}
		}
	}
