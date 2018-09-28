package Week1;

public class StartsWithSContainsA {

	public static void main(String[] args) {
//Defined namList array with 3 string inputs
		String nameList[]= {"Sahil","Arun","Anuj"};
		
		int l=nameList.length;
		
		//Enhanced For Loop
		
		for (String i : nameList) {
			boolean b = i.startsWith("S");
			boolean c = i.contains("a");
			
			if (b==true && c==true) {
				System.out.println(i);
			}
		}
	}

}
