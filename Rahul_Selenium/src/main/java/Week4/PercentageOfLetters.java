package Week4;

import java.util.Scanner;



public class PercentageOfLetters {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String:");
		String InputString =s.nextLine();
				int Upper=0,lower=0,digit = 0,special = 0;
		char c; 
		float PercentageUpper,PercentageLower,PercentageDigit,PercentageSpecial;
		int length = InputString.length();
		System.out.println("Input"+InputString);
		System.out.println("Input"+length);
		for(int i=0;i<length-1;i++) {
			c=InputString.charAt(i);
			
			if(Character.isUpperCase(c)) {
				Upper++;
			}
			
			else if(Character.isLowerCase(c)) {
				lower++;
			}
			else if(Character.isDigit(c)) {
				digit++;
			}
			else {
				special++;
				
			}
		}
		
		PercentageUpper=(float)(Upper*100/length);
		PercentageLower=(lower*100/length);
		PercentageDigit=(digit*100/length);
		PercentageSpecial=(special*100/length);
		System.out.println("Count Upper Case Letters is : "+Upper);
		System.out.println("Count Lower Case Letters is : "+lower);
		System.out.println("Count Digit  is : "+digit);
		System.out.println("Count Specail Letters is : "+special);
		
		System.out.println("Percentage of Upper Case Letters is : "+PercentageUpper);
		System.out.println("Percentage of Lower Case Letters is : "+PercentageLower);
		System.out.println("Percentage of Digit  is : "+PercentageDigit);
		System.out.println("Percentage of Specail Letters is : "+PercentageSpecial);
	}
	

	}
