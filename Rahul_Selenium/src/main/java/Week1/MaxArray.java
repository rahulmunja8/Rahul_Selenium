package Week1;

import java.util.Arrays;

public class MaxArray {

	public static void main(String[] args) {
	
		int[] Numbers = {1,333,565,778,7787,6565,6464,54264,2};
		
		Arrays.sort(Numbers);
		int m = Numbers.length;
		
		System.out.println(Numbers[m-1]);
		
		
	}

}
