package Week3;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
         	System.out.println("Enter the Year: ");
         	int year = s.nextInt();
         	
         	if (year%100==0 && year%400==0) {
         		
         		System.out.println("The year is leap Year");
         	}
         	
         	else if(year%100!=0 && year%4==0){
         		System.out.println("The year is leap Year");
         	}
         	else {
         		
         		System.out.println("The Year is not leap Year");
         	}
         	
	}

}
