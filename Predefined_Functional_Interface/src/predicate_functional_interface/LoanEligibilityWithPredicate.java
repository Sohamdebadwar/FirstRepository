package predicate_functional_interface;

import java.util.Scanner;

public class LoanEligibilityWithPredicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();


        Customer customer = new Customer(name, salary, creditScore, age);


        if (customer.checkLoanEligibility()) {
            System.out.println(name + " is Eligible for Loan...");
        } else {
            System.out.println(name+ " is NOT Eligible for Loan...");
        }

        sc.close();
    }
}