package Week1;

import java.util.Scanner;

public class Odd {
	
	public static void main(){
		
		System.out.println("Enter 5 digit Number ");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int n1 ,n2;
		int sum = 0;
		
		for (int i=10;i<=100000;i=i*10) {
			
			n1=n/i;
			n2=n%i;
			
			if (n2!=0) {
				
				sum = sum+n2;
			}
		}
		
		
		
	}

}
