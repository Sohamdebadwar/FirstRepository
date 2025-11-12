package oop.Interface_withFactoryMethod_scenario1;

public class UPIPayment implements Payment 
{
	@Override
	public void processPayment() 
	{
		System.out.println("Processing UPI payment...");
	}

	@Override
	public void applyDiscount() 
	{
		System.out.println("Applying ₹100 cashback for UPI users.");
	}
}
