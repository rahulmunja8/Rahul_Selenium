package testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TC005_MergeLead extends ProjectMethods {

	//@Before Suite will be invoked to set html report property.Common for all Test cases(predefined)
	//@Before Test will be invoked after to set variable value for @before class method to be added in reports
	//Common for all Test cases(predefined)
	@BeforeTest(groups= {"common"})//Common for all Test cases(predefined) differs for each test case need to be written 
	public void setData() {
		testCaseName="TC003_DeleteLead";
		testCaseDesc="Delete a Lead";
		category="Smoke";
		author="Rahul Munjal";
	}
	@Test(groups= {"regression"},dataProvider="positive")
	public void DuplicateLeads(String lead1 ,String lead2) throws InterruptedException {

		WebElement leads = locateElement("linkText", "Leads");
		click(leads);
		WebElement mergeLeads = locateElement("linkText", "Merge Leads");
		click(mergeLeads);
		WebElement from = locateElement("xpath","(//table[@id='widget_ComboBox_partyIdFrom']//following-sibling::a)");
		click(from);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allhandle = new ArrayList<String>();
		allhandle.addAll(windowHandles);
		String window = allhandle.get(1);
		driver.switchTo().window(window);
		driver.manage().window().maximize();
		WebElement LeadId = locateElement("name","id");
		type(LeadId,lead1);
		WebElement find = locateElement("xpath", "(//tbody/tr/td/em)[1]");
		click(find);
		Thread.sleep(10000);
		WebElement firstOutput = locateElement("xpath","(((//tbody/tr/td[4])//preceding-sibling::td/div/a)[1])");
		click(firstOutput);
		String window1 = allhandle.get(0);
		driver.switchTo().window(window1);

		WebElement to = locateElement("xpath","(//table[@id='widget_ComboBox_partyIdTo']//following-sibling::a)");
		click(to);
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> allhandle1 = new ArrayList<String>();
		allhandle1.addAll(windowHandles1);
		String window2 = allhandle1.get(1);
		driver.switchTo().window(window2);
		driver.manage().window().maximize();
		WebElement LeadId1 = locateElement("name","id");
		type(LeadId1,lead2);
		WebElement find1 = locateElement("xpath", "(//tbody/tr/td/em)[1]");
		click(find1);
		Thread.sleep(10000);
		WebElement firstOutput1 = locateElement("xpath","(((//tbody/tr/td[4])//preceding-sibling::td/div/a)[1])");
		click(firstOutput1);
		String window3 = allhandle1.get(0);
		driver.switchTo().window(window3);
		WebElement merge = locateElement("class","buttonDangerous");
		click(merge);
		driver.switchTo().alert().accept();
		WebElement findLeads = locateElement("linkText", "Find Leads");
		click(findLeads);
		WebElement LeadId2 = locateElement("name","id");
		type(LeadId2,"12223");
		WebElement find2 = locateElement("xpath", "(//tbody/tr/td/em)[1]");
		click(find2);
		WebElement output = locateElement("class","x-paging-info");
		verifyExactText(output, "No records to display");
	}

@DataProvider(name="positive")
public Object[][] fetchData(){
	Object[][] data = new Object[2][2];
	data[0][0]="10780";
	data[0][1]="10269";
	data[1][0]="10836";
	data[1][1]="10598";
	return data;
}
@DataProvider(name="negative")
public void fetchnegData(){}

}
