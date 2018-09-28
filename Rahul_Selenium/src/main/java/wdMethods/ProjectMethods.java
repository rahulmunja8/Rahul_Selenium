package wdMethods;

import java.io.IOException;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectMethods extends SeMethods{
	@BeforeSuite(groups= {"common"})
	public void beforeSuite() {
		beginResult();
	}
	@BeforeClass(groups= {"common"})
	public void beforeClass() {
		startTestCase();
	}
    @Parameters({"url","user","password"})//to receive parameter in test case we need to write before watever method we want to use value
	@BeforeMethod(groups= {"common"})
	public void login(String url,String user,String password) {//we want to use those paramter in this method so we need to provide in the form of argument
    	//can be in any orderr 
    	//we can choose not to use all paramters
    	//But name should be same we defined in testng xml
		startApp("chrome", url);//instead of giving value directly we r using paramter here,values are defined in xml
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, user);
		WebElement elePassword = locateElement("id","password");
		type(elePassword, password);
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		WebElement eleCRM = locateElement("linkText","CRM/SFA");
		click(eleCRM);
	}
	@AfterMethod(groups= {"common"})
	public void closeApp() {
		closeBrowser();
	}
	@AfterSuite(groups= {"common"})
	public void afterSuite() {
		endResult();
	}
	
	@DataProvider(name="fetchData")
	public Object[][] fetchData() throws IOException {
		
		return ReadExcel.getExcelData(ExcelFile);
		
	}
	@DataProvider(name="negative")
	public  void fetchData1() {
	}
	
	
	
	
	
	
	
}
