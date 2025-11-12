package oop.Interface_withFactoryMethod_scenario1;

import java.util.Scanner;

public class PaymentGatewayUsingInterface 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your payment Option :");
		System.out.println("1) Credit Card ");
		System.out.println("2) UPI");
		System.out.println("Please Enter your Choice :");
		int choice = Integer.parseInt(sc.nextLine());
		
		PaymentGateway pay = new PaymentGateway();
		
		switch(choice)
		{
			case 1 -> 
			{
				Payment payment = new CreditCardPayment();
			    Payment initiatePayment = pay.initiatePayment(payment);
			    initiatePayment.processPayment();
			    initiatePayment.applyDiscount();
				
			}
			
			case 2 ->
			{
				Payment payment = new UPIPayment();
				Payment initiatePayment = pay.initiatePayment(payment);
				initiatePayment.processPayment();
				initiatePayment.applyDiscount();
			}
			
			default ->
			{
				System.err.println("Wrong Choice...");
			}
		}
	}
}
