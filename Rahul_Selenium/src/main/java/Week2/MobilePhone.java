package Week2;

public class MobilePhone extends Telecome implements mobilePhone1 {

	public String SendSms() {
		return "Sms Sent";
	}
	
	public String Games() {
		
		return "Enter the world of entertainment";
	}
	
	public String RunMusicPlayer() {
		
		return "Opening..";
	}

	@Override
	public int Number() {
		
		return 9988;
	}

	@Override
	public String ContactName() {
	
		return "Rahul Munjal";
	}
}
