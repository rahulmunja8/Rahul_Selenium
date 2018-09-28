package testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ReadExcel;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods {
	//@Before Suite will be invoked to set html report property.Common for all Test cases(predefined)
	//@Before Test will be invoked after to set variable value for @before class method to be added in reports
	//Common for all Test cases(predefined)
	@BeforeTest(groups= {"common"})//Common for all Test cases(predefined) differs for each test case need to be written 
	public void setData() {
		testCaseName="TC001_CreateLead";
		testCaseDesc="Create a New Lead";
		category="Smoke";
		author="Rahul Munjal";
		ExcelFile="CreateLead";

	}

	//@Before class will be invoked now This will add basic test case related detail in html report.Common for all Test cases(predefined)
	//@Before Method will be invoked which involves login in leaftaps and click on CRM/SFA.Common for all Test cases for leaftaps(predefined)
	//@Test will be invoked which will conatin test case steps should be written separately ion each test case
	@Test(groups= {"smoke"},dataProvider="fetchData")
	public void CreateLead(String cname,String fname,String lname){
		WebElement createLead = locateElement("linkText","Create Lead");
		click(createLead);

		WebElement company = locateElement("id","createLeadForm_companyName");
		type(company,cname);

		WebElement firstName = locateElement("id","createLeadForm_firstName");
		type(firstName,fname);

		WebElement lastName = locateElement("id","createLeadForm_lastName");
		type(lastName,lname);


		WebElement firstNameLocal = locateElement("id","createLeadForm_firstNameLocal");
		type(firstNameLocal,"Rahul");

		WebElement lastNameLocal = locateElement("id","createLeadForm_lastNameLocal");
		type(lastNameLocal,"Munjal");


		WebElement salutation = locateElement("id","createLeadForm_personalTitle");
		type(salutation,"Mr");

		WebElement source = locateElement("id","createLeadForm_dataSourceId");
		selectDropDownUsingText(source,"Existing Customer");

		WebElement title = locateElement("id","createLeadForm_generalProfTitle");
		type(title,"Tester");

		WebElement annualRevenue = locateElement("id","createLeadForm_annualRevenue");
		type(annualRevenue,"1000000");

		WebElement industry = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(industry,"Telecommunications");

		WebElement ownership = locateElement("id","createLeadForm_industryEnumId");
		selectDropDownUsingText(ownership,"Public Corporation");

		WebElement currency = locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingText(currency,"USD - American Dollar");


		WebElement SIC = locateElement("id","createLeadForm_sicCode");
		type(SIC,"45678");


		WebElement desc = locateElement("id","createLeadForm_description");
		type(desc,"Industry Description will be entered here");

		WebElement impNote = locateElement("id","createLeadForm_importantNote");
		type(impNote,"Industry Description important note to be entered here");




		WebElement countryCode = locateElement("id","createLeadForm_primaryPhoneCountryCode");
		countryCode.clear();

		type(countryCode,"+91");

		WebElement areaCode = locateElement("id","createLeadForm_primaryPhoneCountryCode");


		type(areaCode,"44");

		WebElement ext = locateElement("id","createLeadForm_primaryPhoneExtension");

		type(ext,"66733572");


		WebElement phone = locateElement("id","createLeadForm_primaryPhoneNumber");

		type(phone,"7708331227");

		WebElement eNum = locateElement("id","createLeadForm_numberEmployees");

		type(eNum,"4000");

		WebElement ticker = locateElement("id","createLeadForm_tickerSymbol");

		type(ticker,"%");

		WebElement poc = locateElement("id","createLeadForm_primaryPhoneAskForName");

		type(poc,"Sandhya");

		WebElement url = locateElement("id","createLeadForm_primaryWebUrl");

		type(url,"http://www.myntra.com");

		WebElement toName = locateElement("id","createLeadForm_generalToName");

		type(toName,"Rahul");

		WebElement address1 = locateElement("id","createLeadForm_generalAddress1");

		type(address1,"No.10/22");

		WebElement address2= locateElement("id","createLeadForm_generalAddress2");

		type(address2,"10 downing street");

		WebElement city= locateElement("id","createLeadForm_generalCity");

		type(city,"London");	

		WebElement state = locateElement("id","createLeadForm_generalStateProvinceGeoId");
		selectDropDownUsingText(state,"Wisconsin");



		WebElement country = locateElement("id","createLeadForm_generalCountryGeoId");
		selectDropDownUsingText(country,"United States");

		WebElement zip= locateElement("id","createLeadForm_generalPostalCode");

		type(zip,"644444");

		WebElement zipExt= locateElement("id","createLeadForm_generalPostalCodeExt");

		type(zipExt,"44");

		WebElement marketing = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingText(marketing,"Pay Per Click Advertising");

		WebElement email= locateElement("id","createLeadForm_primaryEmail");

		type(email,"support@blahblah.com");

		WebElement createLeadSubmit = locateElement("class","smallSubmit");
		click(createLeadSubmit);
		WebElement firstNameverify = locateElement("id","viewLead_firstName_sp");
		verifyExactText(firstNameverify,"Rahul");
	}

}
