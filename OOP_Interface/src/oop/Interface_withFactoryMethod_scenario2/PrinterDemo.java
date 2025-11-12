package oop.Interface_withFactoryMethod_scenario2;

public class PrinterDemo 
{
	public Printer getPrinter()
	{
		
		return  () -> System.out.println("hii im a Annonymous Inner Class !!!");
		
	}
}

/*
 public class PrinterDemo 
{
	public Printer getPrinter()
	{
		
		return  new Printer() 
		{
			@Override
			public void Print() {};

		}
		
	}
}
 */
