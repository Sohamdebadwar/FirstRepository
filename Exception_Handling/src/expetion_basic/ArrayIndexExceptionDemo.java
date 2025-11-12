package expetion_basic;

import java.util.Scanner;

public class ArrayIndexExceptionDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the index ");
			int index = sc.nextInt();
			 int a[] = new int[2];
			   a[0] = 10;
			   a[1] = 20;
	
			   System.out.println(a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
			System.err.println(e.toString());
			System.err.println(" You tried to access an invalid array index. Please check the index range.");
			e.printStackTrace();
		}
	}
}
