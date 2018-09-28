package Week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeadTestCase {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads");
		driver.findElementByLinkText("Merge Leads");
		driver.findElementById("ext-gen594");
		Set<String> windows = driver.getWindowHandles();
		List<String> windowList = new ArrayList<String>();
		windowList.addAll(windows);
		driver.switchTo().window(windowList.get(1));
		WebElement findLead = driver.findElementByXPath("//input[@name='id']");
		
		findLead.sendKeys("10849");
		driver.findElementByLinkText("Find Leads");
		
	}

}
