package Week3;

public class SwapNumbers {
	// Program to swap two numbers  without 
	// using temporary variable
		 
	    public static void main(String a[])
	    {
	        int x = 10;
	        int y = 5;
	        x = x + y;
	        y = x - y;
	        x = x - y;
	        System.out.println("After swaping:"
	             + " x = " + x + ", y = " + y);
	    }
	}
	 
	
