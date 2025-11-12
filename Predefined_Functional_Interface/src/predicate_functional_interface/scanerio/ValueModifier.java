package predicate_functional_interface.scanerio;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int value = Integer.parseInt(sc.nextLine());
		System.out.println("Original value: "+value);
		
		Consumer<Integer> doub = (val) -> System.out.println("After doubling the value: "+val*2);
		modifyValue(value,doub);
		
		Consumer<Integer> incrementBy = (val) -> System.out.println("After incrementing the value by 3: "+(val+3));
		modifyValue(value,incrementBy);
		
		Consumer<Integer> squareValue = (val) -> System.out.println("After squaring the value: "+(val*val));
		modifyValue(value,squareValue );
		
		sc.close();
	}
	
	
	public static void modifyValue(int value,Consumer<Integer> consumer)
	{
		consumer.accept(value);
	}
	
	
}


