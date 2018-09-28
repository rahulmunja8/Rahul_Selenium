package Week3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSelectDropdown {

	static int i =0;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select Dropdown = new Select(country);
		List<WebElement> options = Dropdown.getOptions();
		
		for (WebElement eachoption:options) {
			if(eachoption.getText().startsWith("E")) {
				i++;
				if (i==2) {
					System.out.println(eachoption.getText());
					eachoption.click();
					break;
				}
			}
			
		}
	}

}
