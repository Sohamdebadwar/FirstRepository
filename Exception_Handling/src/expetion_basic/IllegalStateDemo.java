package expetion_basic;

public class IllegalStateDemo 
{
    public static void main(String[] args) 
    {
    	System.out.println("Calling throwIllegalException from main method:");
        throwIllegalException();
    }

    static void throwIllegalException() {
        try {
            throw new IllegalStateException("MyException");
        } catch (IllegalStateException objA) {
            System.out.println("Caught: " + objA);
        }
    }
}