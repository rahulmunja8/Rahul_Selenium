package Week1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int fact;
		int b;
		fact = a ;
		while (a >1) {
			
			a = a -1;
			fact=fact*a;
			
		}
		
		System.out.println("The Factorial of Number is: "+fact);

	}

}
