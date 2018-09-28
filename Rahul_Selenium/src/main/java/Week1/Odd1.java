package Week1;

import java.util.Scanner;

public class Odd1 {

	public static void main(String[] args) {
System.out.println("Enter 5 digit Number ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int n1 ,n2;
		int sum = 0;
		
		for (int i=1;i<=5;i=i+1) {
			
			
			n2=n%10;
			//System.out.println("n2:"+n2);
			n=n/10;
			//System.out.println("n:"+n);
			
			if (n2%2 !=0) {
				
				sum = sum+n2;
				System.out.println();
			}
			
		}
		System.out.println("The Sum of odd number of n is : "+sum);

	}

}
