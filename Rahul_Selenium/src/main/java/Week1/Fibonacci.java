package Week1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.print("Enter the the value of n :");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a =0;
		int b =1;
		int c = a+b;
		
		System.out.print("Output is :"+a);
		while (c<=n) {
			
			System.out.print(","+c);
			c = a+b;
			a=b;
			b=c;
			
			
		}
		

	}

}
