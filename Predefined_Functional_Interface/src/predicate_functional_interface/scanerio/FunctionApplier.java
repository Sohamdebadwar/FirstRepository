package predicate_functional_interface.scanerio;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		System.out.println("Original value: "+value);
		
		Function<Integer, Integer> add = (val) ->  (val+5);
		System.out.println("After adding 5: "+applyFunction(value,add));
		
		Function<Integer, Integer> mul = (val) ->  (val*2);
		System.out.println("After multiplying by 2: "+applyFunction(value,mul));
		
		Function<Integer, Integer> sub = (val) ->  (val-3);
		System.out.println("After subtracting 3: "+applyFunction(value,sub));
	}
	
	public static int applyFunction(int value,  Function<Integer,Integer> function)
	{
		return function.apply(value);
	}
	
}
