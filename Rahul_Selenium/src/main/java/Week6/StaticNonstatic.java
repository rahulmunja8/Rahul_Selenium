
/* declare 2 String variables (1 static- hello and 1 non static-world.
		 * create two methods 1 static and 1 non static to print both variables.
		 * create a main method to call both the methods.
		 * Expected o/p: Hello World should print twice*/

package Week6;

public class StaticNonstatic {
	public static String a= "Hello";
	 String b = "World";

	public static void STATICMETHOD() {
		//To call a non static variable b in static method you have to create object for that and den call
				StaticNonstatic obj = new StaticNonstatic();
				System.out.println(a+" "+obj.b);

	}
	
	public void NonStaticMethod() {
		
		System.out.println(a+" "+b);
		
	}
	public static void main(String[] args) {
		STATICMETHOD();
		StaticNonstatic obj1 = new StaticNonstatic();
		obj1.NonStaticMethod();
		
	}

}
