package exception_basic.scenario3_2;

public class CommandLineDivision 
{
	public static void main(String[] args) 
	{
		try
		{
			if (args.length != 2 ) 
            {
                System.out.println("Please provide exactly two command-line arguments.");
                return;
            }
			
			try
			{
				int dividend = Integer.parseInt(args[0]);
				int divisor = Integer.parseInt(args[1]);
				
				double result = dividend / divisor;
				System.out.println("Division result :"+result);
			}
			catch (ArithmeticException e) 
			{
                System.out.println("Arithmetic error: " + e.getMessage());
            } 
			catch (NumberFormatException e) 
			{
                System.out.println("NumberFormatException: " + e.getMessage());
            }
			
		}
		catch(IllegalArgumentException e)
		{
			 System.out.println("IllegalArgumentException: " + e.getMessage());
        }
		finally 
		{
            System.out.println("Division operation completed.");
        }
	}
}
