package Week3;



public class ArmstrongProgram {

	public static void main(String[] args) {
		int sum;
		int j;
		int n;
		System.out.println("The Armstrong Number from 100 to 1000 is :");
		for (int i=100;i<=1000;i++) {
			sum=0;
			j=i;
			int Len = String.valueOf(i).length();
			while(j>0) {
				n=j%10;
				sum=sum+(int)(Math.pow(n, Len));
				j=j/10;
			}
			if (i==sum) {
				System.out.println(i);
			}
			
		}
		

	}

}
