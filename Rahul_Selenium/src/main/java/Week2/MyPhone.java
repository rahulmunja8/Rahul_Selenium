package Week2;

public class MyPhone {

	public static void main(String[] args) {
		
		Redmi m = new Redmi();
		
		System.out.println("Open SMS "+m.SendSms());
		System.out.println("Open Games "+m.Games());
		
		MobilePhone mp = new MobilePhone();
		System.out.println("Contact "+ mp.ContactName());
	}

}
