package Week1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	int a,n,sum=0,r;
	Scanner scan=new Scanner(System.in);
	a=scan.nextInt();
	
	n=a;
	while(n>0)
	{
	 r = n%10;
	 sum = sum*10+r;
	 n=n/10;
	}
	
	if (sum == a) {
		
		System.out.println("The Number is palindrome");
		
	}
	
	else {
		
		System.out.println("The Numbers is not palindrome");
		
	}

	}

}
