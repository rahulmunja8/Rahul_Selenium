package Week2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListDemo {

	public static void main(String[] args) {
		
		//The Input String
		String s = "Amazon India";
	
		
//		//Creating Character Type List
//	List <Character>chr = new ArrayList<Character>();
//	//Converting String to Char array
//	char[]allChar=s.toCharArray();
//	for (char c:allChar) {
//		//Taking element from char array and add it to List to create Array List
//		chr.add(c);
//	}
//	Collections.sort(chr);//Sorting in Ascending Order
//	System.out.print("The String sorted in Ascending Order is :");
//	//To Print characters in sorted Order
//	for (char c :chr) {
//		
//		System.out.println(c);
//	}
	
	
//For Sorting array in reverse Without case sensitivity
	String LCase=s.toLowerCase();
	//First We need to clear old Array List created for reuse or we can create New One
	//Method to clear chr.clear();
	//But We are creating New List for Better Understanding
	List<Character>chr1= new ArrayList<Character>();
	char[]allChar1=LCase.toCharArray();
	for(char c1:allChar1) {
		chr1.add(c1);
	}
	
	Collections.reverse(chr1);
	
	System.out.println("The String sorted in Reverse Order is :");
	
	for(char c1:chr1) {
		System.out.println(c1);
	}
	}
}
