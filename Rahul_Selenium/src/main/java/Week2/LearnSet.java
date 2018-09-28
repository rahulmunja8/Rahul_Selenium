package Week2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> mobiles= new LinkedHashSet<String>();
		mobiles.add("Nokia");
		mobiles.add("Micromax");
	
		mobiles.add("Spice");
		mobiles.add("Samsung");
		mobiles.add("Nokia");
		mobiles.add("Moto");
		mobiles.add("RedMi");
		System.out.println("The Content of Set is : ");
		for (String a : mobiles) {
			System.out.println(a);
		}

		List<String>lst=new ArrayList<String>();
		lst.addAll(mobiles);
		System.out.println("List is : "+lst );
		
	String First=lst.get(0);
	System.out.println("The First element is "+First);
		
	}

}
