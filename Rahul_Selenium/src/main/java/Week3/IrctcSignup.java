package Week3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.findElementById("userRegistrationForm:userName").sendKeys("sandhya");
		driver.findElementById("userRegistrationForm:password").sendKeys("sandhya68");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("sandhya68");
		WebElement src=driver.findElementById("userRegistrationForm:securityQ");
		Select dropDown = new Select(src);
		dropDown.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("sandy");
		WebElement src1=driver.findElementById("userRegistrationForm:prelan");
		Select dropDown1 = new Select(src1);
		dropDown1.selectByIndex(0);
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Sandhya");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Sundaran");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		WebElement src2=driver.findElementById("userRegistrationForm:dobDay");
		Select dropDown2 = new Select(src2);
		dropDown2.selectByVisibleText("14");;
		WebElement src3=driver.findElementById("userRegistrationForm:dobMonth");
		Select dropDown3 = new Select(src3);
		dropDown3.selectByVisibleText("FEB");
		WebElement src4=driver.findElementById("userRegistrationForm:dateOfBirth");
		Select dropDown4 = new Select(src4);
		dropDown4.selectByVisibleText("1991");
		WebElement src5=driver.findElementById("userRegistrationForm:occupation");
		Select dropDown5 = new Select(src5);
		dropDown5.selectByIndex(3);
		driver.findElementById("userRegistrationForm:idno").sendKeys("FCBPS7632L");
		WebElement src6=driver.findElementById("userRegistrationForm:countries");
		Select dropDown6 = new Select(src6);
		dropDown6.selectByVisibleText("India");
		driver.findElementById("userRegistrationForm:email").sendKeys("ssandhya68@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8913010514");
		WebElement src7=driver.findElementById("userRegistrationForm:nationalityId");
		Select dropDown7 = new Select(src7);
		dropDown7.selectByIndex(1);
		driver.findElementById("userRegistrationForm:address").sendKeys("HC/47/407");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600101",Keys.TAB);
		Thread.sleep(5000);
		WebElement src8=driver.findElementById("userRegistrationForm:cityName"	);
		Select dropDown8 = new Select(src8);
		dropDown8.selectByIndex(1);
		Thread.sleep(5000);
		WebElement src9=driver.findElementById("userRegistrationForm:postofficeName");
		Select dropDown9 = new Select(src9);
		dropDown9.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("044-26150324");
		
	} 

}