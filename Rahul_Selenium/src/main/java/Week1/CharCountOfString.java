package Week1;

public class CharCountOfString {

	public static void main(String[] args) {
			String s1= "MyNameisRahul";
			
			int a = s1.length();
			String s = s1.toLowerCase();
			boolean b = s.contains("a");
			int count = 0;
			
			char[] cha = s.toCharArray();
			for (int i=1;i<=a-1;i++) {
				
				if (cha[i]=='a') {
				
					count++;
				}
				
				
			}
			
			System.out.println(count);

	}

}
