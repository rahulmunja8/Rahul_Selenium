package Week1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a ;
		int RevNo=0;
		int i =1;
		while(n>0){
			System.out.println("Loop iteration "+i);
			a = n%10;
			System.out.println("a:"+a);
			RevNo=RevNo*10+a;
			System.out.println("RevNo:"+RevNo);
			n=n/10;
			System.out.println("n:"+n);
			i++;
		}
System.out.println("The Reversed Number is "+RevNo);

	}

}
