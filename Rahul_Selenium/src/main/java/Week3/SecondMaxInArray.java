package Week3;

import java.util.Arrays;

public class SecondMaxInArray {

	public static void main(String[] args) {
			int [] array= {-20,-340,-21,-879,-92,-21,-474,-83647,-200};
			Arrays.sort(array);
			for(int eachnum:array) {
				
				System.out.println(eachnum);
			}
			
			int length=array.length;
			System.out.println("Second largest Number of array is : "+array[length-2]);

	}

}
