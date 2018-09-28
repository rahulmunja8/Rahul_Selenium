package Week1;

public class StringCaseChange {

	public static void main(String[] args) {
		//Define input string 
	String str = "TestLeaf";
	//Convert string str in char array
	char[] chr = str.toCharArray();
	//length of string for using looping
	int l = str.length();
	
	//Define ch to store value at each index in loop
	char ch ;
	for (int i=1;i<l;i++)
		
	{
		if (i%2==0) {
		ch=chr[i];
		
	}
		else
		{
			//Convert to upper case for odd index
			ch = Character.toUpperCase(chr[i]);
			
			//Write back new value to the array
			chr[i]=ch;
		}
		//To convert back tO String
	String b = String.valueOf(chr);

	System.out.println(b);
	



	}
	


}
}