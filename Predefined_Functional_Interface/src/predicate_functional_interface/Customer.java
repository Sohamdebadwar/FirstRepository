package predicate_functional_interface;

import java.util.function.Predicate;

public record Customer(String name,Double salary,Integer creditScore,Integer age) 
{
	public boolean checkLoanEligibility()
	{
		Predicate<Customer> check = c -> c.salary>25000 && 
				c.creditScore>700 && c.age>21;
				
				return check.test(this);	
	}
}
