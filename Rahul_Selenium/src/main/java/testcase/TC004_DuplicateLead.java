package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TC004_DuplicateLead extends ProjectMethods {

	//@Before Suite will be invoked to set html report property.Common for all Test cases(predefined)
	//@Before Test will be invoked after to set variable value for @before class method to be added in reports
	//Common for all Test cases(predefined)
	@BeforeTest(groups= {"common"})//Common for all Test cases(predefined) differs for each test case need to be written 
	public void setData() {
		testCaseName="TC004_DuplicateLead";
		testCaseDesc="Create  a duplicate Lead";
		category="Smoke";
		author="Rahul Munjal";
	}
	@Test(groups= {"regression"},dataProvider="Positive")
	public void DuplicateLeads(String Email) throws InterruptedException {

		WebElement leads = locateElement("linkText", "Leads");
		click(leads);
		WebElement findLeads = locateElement("linkText", "Find Leads");
		click(findLeads);
		WebElement email = locateElement("linkText", "Email");
		click(email);
		WebElement emailAddress = locateElement("name","emailAddress");
		
		type(emailAddress,Email);  

		WebElement find = locateElement("xpath", "(//tbody/tr/td/em)[7]");
		click(find);
		Thread.sleep(10000);
		WebElement firstOutput = locateElement("xpath","((//tbody/tr/td[4])//preceding-sibling::td)[3]/div/a");
		getText(firstOutput);
		String text = getText(firstOutput);
		System.out.println("The Value of first element is "+text);
		WebElement firstOutput1 = locateElement("xpath","((//tbody/tr/td[4])//preceding-sibling::td)[3]/div/a");
		click(firstOutput1);

			WebElement duplicate = locateElement("linkText","Duplicate Lead");
			click(duplicate);
			
			String title = driver.getTitle();
			System.out.println(title);
			
			WebElement create = locateElement("class","smallSubmit");
			click(create);
			
WebElement nameVerify = locateElement("id","viewLead_firstName_sp");
System.out.println("First Name is "+nameVerify.getText().replaceAll("[^a-zA-Z]", ""));

	
	
	}
	@DataProvider(name="Positive")
	public Object[][] fetchData(){
		Object[][] data = new Object[2][1];
		data[0][0]="support@blahblah.com";
		data[1][0]="nadhiya@gmail.com";
		return data;
	}
	@DataProvider(name="negative")
	public void fetchData1() {
		
	}

}
