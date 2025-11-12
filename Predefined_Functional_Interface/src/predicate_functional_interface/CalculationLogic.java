package predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class CalculationLogic 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Predicate<Integer> isEven = num -> num%2 ==0;
		Predicate<Integer> isGreaterThanTen = num -> num >= 10;
		Predicate<Integer> isPrime = num ->
		{
			for(int i=2; i<=num/2;i++)
			{
				if(num%i ==0)
				{
				return false;
				}
			}
			return true;
		};
			
		System.out.println(number+" is even: "+testPredicate(number,isEven)); 
		System.out.println(number+" is greater than 10: "+testPredicate(number,isGreaterThanTen));
		System.out.println(number+" is Prime :"+testPredicate(number,isPrime));
	
	}
	
	public static boolean testPredicate(int x ,Predicate<Integer> predicate)
	{
		return predicate.test(x);
	}
}

