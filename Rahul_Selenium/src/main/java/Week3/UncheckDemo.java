package Week3;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		driver.manage().window().maximize();

List<WebElement> Alloptions = driver.findElementsByXPath("//input[@type='checkbox']");
		
		for (WebElement eachop:Alloptions) {
			boolean selected = eachop.isSelected();
			if(selected) {
								eachop.click();
			}
		}
		

	}

}
