package exception_basic.scenario2;

public class ClassCastExceptionDemo 
{   
    public static void handleClassCastException() 
    {	
        Object[] objects = {"Hello",123,"Java"};

        for (Object obj : objects) 
        {
            try 
            {
                
                String str = (String) obj;
                System.out.println("Casting successful: " + str);
            } 
            catch (ClassCastException e)
            {
               
                System.err.println("ClassCastException: Cannot cast " 
                                   + obj.getClass().getName() + " to String.");
                
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) 
    {
        handleClassCastException();
    }
}
