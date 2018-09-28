package Week4;

import java.util.Scanner;

public class CC_13 {
	
	static int getLessThan(int Number ,int Digit) {
		
		//Converting digit to char
		char c = Integer.toString(Digit).charAt(0);
		//Decrementing Number checking weather it contains digit
		for(int i = Number;i>0;--i) {
			if (Integer.toString(i).indexOf(c)==-1) {
				//iF i doesn't contains c it will return -1 or else it will return actual index of number
				return i;
			}
		
	}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Number:");
		int Number= s.nextInt();
		System.out.println("Enter a digit");
		int Digit = s.nextInt();
		System.out.println(getLessThan(Number,Digit));
	}

}
