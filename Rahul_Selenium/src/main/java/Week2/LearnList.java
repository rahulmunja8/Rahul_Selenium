package Week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		List<String> myphones= new ArrayList<String>();
		myphones.add("Nokia");
		myphones.add("Micromax");
		myphones.add("Spice");
		myphones.add("Samsung");
		myphones.add("Moto");
		myphones.add("Redmi");
		int size = myphones.size();
		System.out.println("The Count of Mobiles is : "+size);
		
		System.out.println("The last but one Mobile is : "+myphones.get(size-2));
		
		Collections.sort(myphones);
		System.out.println("The sorted arraysList is : ");
		for (String eachphone:myphones) {
			System.out.println(eachphone);
		}
		

	}

}
