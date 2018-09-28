package Week3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastButOneDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leafground.com/pages/Dropdown.html");
	    WebElement drop1 = driver.findElementById("dropdown1");
	    Select dropdown = new Select(drop1);
	    List<WebElement> drop2 = dropdown.getOptions();
	    int size = drop2.size();
	    WebElement LastButOne = drop2.get(size-2);
	    LastButOne.click();
	    
	}
}
