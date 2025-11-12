package oop.Interface_withFactoryMethod_scenario1;

public class PaymentGateway 
{
	public Payment initiatePayment(Payment payment)
	{
		if(payment instanceof CreditCardPayment)
		{
			System.out.println("Initiating Credit Card payment.");
			return new CreditCardPayment();
		}
		else
		{
			System.out.println("Initiating UPI payment.");
			return new UPIPayment();
		}
	}
	
	
	
	
}
