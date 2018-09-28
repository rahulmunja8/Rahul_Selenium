package Week6;

public class StaticNonstatic {
	 static String a= "Hello";
	 String b = "World";

	public static void STATICMETHOD() {
		
		System.out.println(a);
//		System.out.println(b);
	}
	
	public void NonStaticMethod() {
		
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		STATICMETHOD();
		StaticNonstatic a = new StaticNonstatic();
//		StaticNonstatic.NonStaticMethod();

	}

}
