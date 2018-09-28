package Week3;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.chrome.ChromeDriver;

 	
public class LoginException {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{driver.findElementById("username1").sendKeys("DemoSalesManager");}

catch(NoSuchElementException e) {
		System.out.println("NoSuchElementException Exception thrown");
			
		}
		finally {
			
		driver.close();
		}
	}

}
