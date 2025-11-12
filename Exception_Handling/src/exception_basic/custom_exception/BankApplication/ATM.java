package exception_basic.custom_exception.BankApplication;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Select an option : ");
			System.out.println("1. Deposit ");
			System.out.println("2. Withdraw ");
			System.out.println("3. Transfer ");
			System.out.println("4. Loan Application ");
			System.out.println("5. Check Balance");
			System.out.println("6. Exit");
			System.out.print("Enter your option : ");
			int choice = Integer.parseInt(sc.nextLine());
			BankAccount bank = new BankAccount(12345,10_000);
			
			switch(choice)
			{
				case 1 ->
				{
					System.out.print("Enter Customer name : ");
					String customerName = sc.nextLine();
					System.out.print("Enter amount to Deposite : ");
					int amount = Integer.parseInt(sc.nextLine());
					bank.deposite(amount);
				}
				
				case 2 ->
				{
					System.out.print("Enter Customer name : ");
					String customerName = sc.nextLine();
					System.out.print("Enter amount to Withdrawl : ");
					int amount = Integer.parseInt(sc.nextLine());
					bank.withdrawal(amount);
				}
				
				
				
				case 3 -> {
				    System.out.print("Enter Customer name : ");
				    String customerName = sc.nextLine().trim();

				    System.out.print("Enter amount to Transfer : ");
				    double amount = Double.parseDouble(sc.nextLine().trim());

				    try {
				       
				        BankAccount acc1 = new BankAccount(1111, 60000);
				        BankAccount acc2 = new BankAccount(2222, 3000);
				        Customer customer1 = new Customer("Alice", acc1);
				        Customer customer2 = new Customer("Bob", acc2);

				        if (customerName.equalsIgnoreCase(customer1.getName())) {
				            acc1.transfer(acc2, amount);
				            System.out.println("Transfer successful.");
				        } 
				        else if (customerName.equalsIgnoreCase(customer2.getName())) {
				            acc2.transfer(acc1, amount);
				            System.out.println("Transfer successful.");
				        } 
				        else {
				            throw new AccountNotFoundException("Customer not found for transfer.");
				        }
				    } 
				    catch (AccountNotFoundException  | InvalidAmountException e) {
				        System.out.println("Transfer failed: " + e.getMessage());
				    } 
				    catch (Exception e) {
				        System.out.println("Unexpected error: " + e.getMessage());
				    }
				}

				
				case 4 ->
				{
					System.out.print("Enter Customer name : ");
					String customerName = sc.nextLine();
					System.out.print("Enter loan amount to apply: ");
					int amount = Integer.parseInt(sc.nextLine());
					bank.applyForLoan(amount);
				}
				
				case 5 ->
				{
					System.out.print("Enter Customer name : ");
					String customerName = sc.nextLine();
					System.out.println("Your Bank Balance Amount Is :"+bank.getBalance());
				}
				
				case 6 ->
				{
					System.out.println("Thank you for using the ATM. Goodbye! ");
					System.exit(0);
				}
				
				default ->
				{
					System.err.println("Enter The Valid Choice !!!");
				}
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		//	e.printStackTrace();
		}
		
	}


}
