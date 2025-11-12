package predicate_functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class CarSelling 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the brand name of the Car : ");
		String name =sc.nextLine();
		System.out.print("Enter the price of the Car :");
		Double carPrice = Double.parseDouble(sc.nextLine());
		System.out.print("Enter the mileage of the Car :");
		Integer mileage = Integer.parseInt(sc.nextLine());
		
		Car car = new Car(name, carPrice, mileage);
		
		Predicate<Double> c1 = (Price) -> Price <=500000  && mileage>20;
		boolean result1 = c1.test(carPrice);
		
		Predicate<Integer> c2 = (mil) -> mileage>20;
		boolean result2 = c2.test(mileage);
		
		if(result1 && result2)
		{
			System.out.println(name+" is eligible for sale");
		}
		else
		{
			System.out.println(name+" is not eligible for sale");
		}
		
		sc.close();
			
	}
}
