package exception_basic.scenario2;

import java.util.Scanner;
public class ClassNotFoundExceptionDemo
{
    public ClassNotFoundExceptionDemo(String str)
    {
       
       try
       {
    	   Class cls = Class.forName(str);
        System.out.println(cls.getClass());
       }
       catch(ClassNotFoundException e)
       {
          System.out.println(e);
       }
    }

   public static void main(String[] args)
   {
	   ClassNotFoundExceptionDemo c1 = new ClassNotFoundExceptionDemo("java.util.Scanner");
   }
}