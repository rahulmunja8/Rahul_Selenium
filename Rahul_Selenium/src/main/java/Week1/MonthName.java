package Week1;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int i = s.nextInt();
		
		String[] b = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
		int j = i-1;
		
		String k = b[j];
		System.out.println("The "+i+"th month of the year is "+k);
		
	
		
		if (j%2==0) {
			if (j==8||j==10) {
				
				System.out.println("Number of days  in the month of "+k+" is "+30);
			}
			else {
				System.out.println("Number of days  in the month of "+k+" is"+31);
			}
			
		}
		
		else {
			if (j==7||j==9||j==11) {
				System.out.println("Number of days  in the month of "+k+" is "+31);
			}
			else {
				System.out.println("Number of days  in the month of "+k+" is "+30);
			}
			
		}
		
	}
}
