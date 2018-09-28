package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TC003_DeleteLeads extends ProjectMethods {
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
		
		@Test(groups= {"sanity"},dataProvider="Positive")
		public void DeleteLead(String country,String area,String phoneno) {
			
			WebElement leads = locateElement("linkText", "Leads");
			click(leads);
			WebElement findLeads = locateElement("linkText", "Find Leads");
			click(findLeads);
			WebElement phone = locateElement("linkText", "Phone");
			click(phone);
			
	WebElement countryCode = locateElement("name", "phoneCountryCode");
	   countryCode.clear();

	    type(countryCode,country);
			
			WebElement areaCode = locateElement("name", "phoneAreaCode");
			type(areaCode,area);
			
			WebElement phoneNumber = locateElement("name", "phoneNumber");
			type(phoneNumber,phoneno);
			WebElement find = locateElement("xpath", "(//tbody/tr/td/em)[7]");
		   click(find);
			WebElement firstOutput = locateElement("xpath","(//tbody/tr/td/div/a)[1]");
			getText(firstOutput);
			String text = getText(firstOutput);
			System.out.println("The Value of first element is "+text);
			WebElement firstOutput1 = locateElement("xpath","(//tbody/tr/td/div/a)[1]");
			click(firstOutput1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement delete = locateElement("class", "subMenuButtonDangerous");
			click(delete);
			WebElement findlead = locateElement("linkText","Find Leads");
			click(findlead);
			
			WebElement leadId = locateElement("xpath","(//input[@name='id'])");
			type(leadId,text);
			WebElement findlead2 = locateElement("xpath", "(//tbody/tr/td/em)[7]");
			click(findlead2);
			WebElement output = locateElement("class","x-paging-info");
			verifyExactText(output, "No records to display");
		}
		
		@DataProvider(name="Positive")
		public Object[][] fetchData(){
			Object[][] data = new Object[2][3];
			data[0][0]="91";
			data[0][1]="44";
			data[0][2]="9187636747";
			data[1][0]=" ";
			data[1][1]=" ";
			data[1][2]="7708331227";
			return data;
		}

		@DataProvider(name="negative")
		public void fetchData1(){
			
		}
		
}

