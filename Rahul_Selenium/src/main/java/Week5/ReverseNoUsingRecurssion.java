package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNoUsingRecurssion {
	static int a =0;
	static int n;
	static int RevNum=0;
	static String str;
	static String str1="";
	
	static int j=0;
	static void p() {//function for int reverse loop
		
		if(n>0) {
			//to get digit one by one
		a=n%10;
		//to modify number for next iteration
		n=n/10;
		//to create number from one one digit 
		RevNum=RevNum*10+a;
		//as long as n is greater than 0 it will keep on calling same method and once n is 0 it will print output
		//instead of for loop and while loop we used just if condition and recursive method
		//function of loop is to iterate until condition is method
		//here we r simply calling one method multiple times until n >0
			p();
		}
		
	
		else {
			System.out.println("The reverse number is :"+RevNum);}
	}
	
	public static String reverseString(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverseString(str.substring(1)) + str.charAt(0);
        
    }
}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a Number:");
		 n = s.nextInt();
		System.out.println("Enter the string:");
		 str=s.next();
		int length = str.length();
		int  i=length-1;
		p();//calling recursive method 
		s();

	}

}
