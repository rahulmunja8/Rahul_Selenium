package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TC004_EditLeads extends ProjectMethods {

	//@Before Suite will be invoked to set html report property.Common for all Test cases(predefined)
	//@Before Test will be invoked after to set variable value for @before class method to be added in reports
	//Common for all Test cases(predefined)
	@BeforeTest(groups= {"common"})//Common for all Test cases(predefined) differs for each test case need to be written 
	public void setData() {
		testCaseName="TC004_EditLead";
		testCaseDesc="Edit a Lead";
		category="Smoke";
		author="Rahul Munjal";
	}
	@Test(groups= {"sanity"},dataProvider="positive")
	public void EditLeads(String myname) throws InterruptedException {

		WebElement leads = locateElement("linkText", "Leads");
		click(leads);
		WebElement findLeads = locateElement("linkText", "Find Leads");
		click(findLeads);

		WebElement name = locateElement("xpath", "((//label[text()='First name:']//parent::div/div//child::input)[3])");
		type(name,myname);

		WebElement find = locateElement("xpath", "(//tbody/tr/td/em)[7]");
		click(find);
		Thread.sleep(10000);
		WebElement firstOutput = locateElement("xpath","(//tbody/tr/td/div/a)[1]");
		getText(firstOutput);
		String text = getText(firstOutput);
		System.out.println("The Value of first element is "+text);
		WebElement firstOutput1 = locateElement("xpath","(//tbody/tr/td/div/a)[1]");
		click(firstOutput1);
			String title = driver.getTitle();
			System.out.println(title);
			WebElement edit = locateElement("linkText","Edit");
			click(edit);
			WebElement companyName = locateElement("id","updateLeadForm_companyName");
			type(companyName,"Computer science Corporation");
			WebElement update = locateElement("xpath","((//input[@class='smallSubmit'])[1])");
click(update);
Thread.sleep(10000);
WebElement companyNameVerify = locateElement("id","viewLead_companyName_sp");
System.out.println("Company Name is "+companyNameVerify.getText().replaceAll("[^a-zA-Z]", ""));

	
	
	}
	@DataProvider(name="positive")
	public Object[][] fetchData(){
		Object[][] data = new Object[2][1];
		data[0][0]="Rahul";
		data[1][0]="Sandhya";
		return data;
		
	}
@DataProvider(name="negative")
public void fetchData1() {
	
}
}
