package multithreading.internal_thread_communication;

public class ATMMachine
{
	public static void main(String[] args) 
	{
		Account account = new Account(); 
		
		Drawer withdraw= new Drawer(account);
		Depositor deposite = new Depositor(account);
		
		withdraw.start();
		deposite.start();
	} 
}
