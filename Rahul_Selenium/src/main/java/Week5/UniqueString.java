package Week5;

public class UniqueString {

	public static void main(String[] args) {
		
		/*Write a simple Java program to identify and form a string with unique characters. 
		Ex. Input=Good Looking. 
			Output should be = godlkin.*/
		
		
		String input="Good looking"; //Input
		
		String output="";//Created a empty string 
		
		//creating character ARRAY from string input
		char b[]=input.toLowerCase().replace(" ", "").toCharArray();//replace(" ", "") to replace spaces with no space
		
		System.out.println("Input:"+input);
		
		for (int i=0;i<b.length;i++) {
//if output doesn't contain the character already den it will add dat to output string using concatenation
			
			if(!output.contains(b[i]+"")) //or if(output.indexOf(b[i]) == -1)
			{
				output = output + b[i];
			}
		}
	System.out.println("Output:"+output);
	}

}
