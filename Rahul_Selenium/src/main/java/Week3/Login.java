package Week3;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("CSC");
		driver.findElementById("createLeadForm_firstName").sendKeys("Rahul");
		driver.findElementById("createLeadForm_lastName").sendKeys("Munjal");
		
		WebElement src=driver.findElementById("createLeadForm_dataSourceId");
		Select dropDown = new Select(src);
		dropDown.selectByVisibleText("Direct Mail");
		
		WebElement src1 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dropDown1 = new Select(src1);
	    
		List<WebElement> options2 = dropDown1.getOptions();
	
		int size=options2.size();
		dropDown1.selectByIndex(size-2);
		
		
		//driver.findElementByClassName("smallSubmit").click();
	}

}