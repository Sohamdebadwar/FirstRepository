package exception_basic.scenario3_3;

import java.util.Scanner;

public class TransacttionDetails 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		FinancialTransaction Transaction = new FinancialTransaction();
		double trans = sc.nextDouble();
		long acco = sc.nextLong();
		Transaction.processTransaction(trans,acco);
		sc.close();
	}
}
