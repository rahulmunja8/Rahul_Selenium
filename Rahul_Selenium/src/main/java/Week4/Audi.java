package Week4;


class Vehicle{
	 public Vehicle() {
		 System.out.println("Constructor inside vehicle class");
	 }
}
class Car extends Vehicle{
	public Car() {
		System.out.println("Constructor inside car class");
	}
}
	
	

public class Audi extends Car{
	public Audi() {
		System.out.println("Constructor inside Audi class");
	}

	public static void main(String[] args) {
		
new Audi();
	}

}
