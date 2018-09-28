package Week3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation{
	String Password;
	
	Validation(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Password");
		Password = s.next();
	}
public void validation(){
		
		
		String pat="(\\w {10,}) ([A-Z] {1,}) ([a-zA-Z] {2,})(\\d{2,})";
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(Password);
		
			System.out.println(m.matches());
		
	}
	
}