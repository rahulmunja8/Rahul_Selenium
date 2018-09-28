package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement contact1 = driver.findElementByLinkText("AGENT LOGIN");
		contact1.click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement contact = driver.findElementByLinkText("Contact Us");
		contact.click();
		System.out.println(driver.getTitle());
		Set<String> windows = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>();
		listOfWindows.addAll(windows);
		driver.switchTo().window(listOfWindows.get(1));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(listOfWindows.get(0));

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
