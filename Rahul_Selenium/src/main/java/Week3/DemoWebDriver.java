package Week3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		List<WebElement> checkbox = driver.findElementsByXPath("//input[@type='checkbox']");
		System.out.println("The No of checkbox is :"+checkbox.size());
		int s = checkbox.size();
		WebElement lastCheckbox = checkbox.get(s-1);
		lastCheckbox.click();
		WebElement Eighty = driver.findElementByXPath("//font[contains(text(),'80')]/following::input");
		Eighty.click();
		
}
}

