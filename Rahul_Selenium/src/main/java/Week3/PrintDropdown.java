package Week3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement country = driver.findElementById("userRegistrationForm:countries");
		Select Dropdown = new Select(country);
		List<WebElement> CountryOption = Dropdown.getOptions();
		System.out.println("The List of values in dropdown is : ");
		for(WebElement printDropDown:CountryOption) {
			System.out.println(printDropDown.getText());
			
		}
		
driver.close();
	}

}
