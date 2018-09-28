package testcase;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods_Old.SeMethods;

public class TC002_FindLeads extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
//		WebElement eleLogout = locateElement("class", "decorativeSubmit");
//		click(eleLogout);
		WebElement crm  = driver.findElementByLinkText("CRM/SFA");

		click(crm);
		WebElement leads = locateElement("linktext", "Leads");
		click(leads);
		WebElement findLeads = locateElement("linktext", "Find Leads");
		click(findLeads);
		WebElement phone = locateElement("linktext", "Phone");
		click(phone);
		
WebElement countryCode = locateElement("name", "phoneCountryCode");
   countryCode.clear();

    type(countryCode,"91");
		
		WebElement areaCode = locateElement("name", "phoneAreaCode");
		type(areaCode,"44");
		
		WebElement phoneNumber = locateElement("name", "phoneNumber");
		type(phoneNumber,"9187636747");
		WebElement find = locateElement("xpath", "(//tbody/tr/td/em)[7]");
	   click(find);
		WebElement firstOutput = locateElement("xpath","(//tbody/tr/td/div/a)[1]");
		getText(firstOutput);
		String text = getText(firstOutput);
		System.out.println("The Value of first element is "+text);
		click(firstOutput);
		WebElement delete = locateElement("linktext", "Delete");
		click(delete);
		WebElement findlead = locateElement("linktext","Find Leads");
		click(findlead);
		
		WebElement leadId = locateElement("xpath","(//input[@name='id'])");
		type(leadId,text);
		WebElement findlead2 = locateElement("xpath", "(//tbody/tr/td/em)[7]");
		click(findlead2);
		WebElement output = locateElement("class","x-paging-info");
		verifyExactText(output, "No records to display");
		closeAllBrowsers();
	}

}
