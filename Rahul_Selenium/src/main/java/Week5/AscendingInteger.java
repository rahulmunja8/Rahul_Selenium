package Week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class AscendingInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the Number:");
		int Number = s.nextInt();
        
		Set<Integer> num = new LinkedHashSet<Integer>();
		int a ;
		while(Number>0) {
			a=Number%10;
			Number=Number/10;
			num.add(a);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(num);
		Collections.sort(list);
		int size = list.size();
		int number=0;
		for(int i=0;i<size;i++) {
			
			number=number*10+(list.get(i));
			}
		System.out.println("Output"+number);
	}

}
