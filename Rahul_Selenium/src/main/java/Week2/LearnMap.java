package Week2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMap {

	public static void main(String[] args) { 
		String s = "Rahul Munjal";//Input String
		char[] charArray = s.toCharArray();//Converting String to char array
		
		Map<Character,Integer>amzn = new LinkedHashMap<Character,Integer>();//Creates a map
		
		for (char a :charArray) {
			//Go through char array and add all elements to map
			if (amzn.containsKey(a)) {
				//if condition to verify weather input string has duplicate character
				System.out.println(a+" is the Duplicate character in Name");
				amzn.put(a, 1);
			}
			else {
				//adding character to map with value as 1
				amzn.put(a, 1);
			}
			
					
		}
		//Printing Map
		System.out.println(amzn);

	}

}
