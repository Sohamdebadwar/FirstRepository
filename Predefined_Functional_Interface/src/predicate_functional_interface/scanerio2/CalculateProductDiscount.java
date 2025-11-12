package predicate_functional_interface.scanerio2;

import java.util.Scanner;
import java.util.function.Function;

public class CalculateProductDiscount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter Product Id :");
        int id = sc.nextInt();
        sc.nextLine();  
        
        System.out.print("Enter Product Name :");
        String name = sc.nextLine();

        System.out.print("Enter Product Price :");
        double price = sc.nextDouble();

       
        Product product = new Product(id, name, price);

        
        Function<Product, Double> discountFunction = p -> {
            if (p.price() >= 5000) {
                return p.price() - (p.price() * 0.10); 
            } else {
                return p.price() - (p.price() * 0.05);  
            }
        };

       
        double finalPrice = discountFunction.apply(product);
        System.out.println("Final price of the product is :" + finalPrice);
        sc.close();
    }
}