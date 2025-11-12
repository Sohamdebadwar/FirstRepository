package predicate_functional_interface.scanerio2;

import java.util.Scanner;
import java.util.function.Consumer;

public class StudentNotification 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int number = Integer.parseInt(sc.nextLine());
		
		for(int i=1; i<=number ; i++)
		{
			System.out.print("Enter details for Student "+i+":\n");
			System.out.print("Enter ID: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Course: ");
			String course = sc.nextLine().toLowerCase();
			
			
			Student student = new Student(id,name,course);
			 Consumer<Student> consumer = (std) ->
			 {
				 if(course.equals("java"))
				 {
					 System.out.print("Hello "+name+" Welcome to the "+course+" course.");
				 }
				 else if(course.equals("advanced java"))
				 {
					 System.out.print("Hello "+name+" Welcome to the "+course+" course.");
				 }
				 else if(course.equals("spring boot"))
				 {
					 System.out.print("Hello "+name+" Welcome to the "+course+" course.");
				 }
				 else
				 {
					 System.err.println("enter the correct course");
				 }
			 };
			 consumer.accept(student);
		}
	}
}
