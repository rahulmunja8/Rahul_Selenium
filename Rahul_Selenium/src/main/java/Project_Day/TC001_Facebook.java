package Project_Day;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TC001_Facebook extends ProjectMethods {

	//@Before Suite will be invoked to set html report property.Common for all Test cases(predefined)
		//@Before Test will be invoked after to set variable value for @before class method to be added in reports
		//Common for all Test cases(predefined)
		@BeforeTest//Common for all Test cases(predefined) differs for each test case need to be written 
		public void setData() {
			testCaseName="TC001_CreateLead";
			testCaseDesc="Create a New Lead";
			category="Smoke";
			author="Rahul Munjal";

		}
		
		@BeforeMethod
		public void login() throws InterruptedException {
			startApp("chrome", "https://www.facebook.com/");
			WebElement eleUserName = locateElement("id", "email");
			type(eleUserName, "**********");
			WebElement elePassword = locateElement("id","pass");
			type(elePassword, "********");
			WebElement eleLogin = locateElement("xpath", "(//input[@value='Log In'])");
			click(eleLogin);
			Thread.sleep(3000);
}
		
		@Test
		public void like() throws InterruptedException {
			
			WebElement search = locateElement("xpath","(//div[@class='_5861 navigationFocus textInput _5eaz']//*[2])");
	       type(search,"TestLeaf");
	       WebElement searchclick = locateElement("xpath","( //div[@class='_585-']//form/button)");
	       click(searchclick);
//	       WebElement TestLeaf = locateElement("xpath","(//*[@id=\"xt_uniq_19\"]/div/div[1]/a)");
//	       verifyPartialText(TestLeaf,"TestLeaf");
	       WebElement Like = locateElement("xpath","(//button[contains(@class,'PageLikeButton')])");
	       String likeOrNot = getText(Like);
//	       if(likeOrNot.equalsIgnoreCase("Like")) {
//	    	   click(Like);
//	       }
//	       else {
//	    	   System.out.println("The Page is already Liked");
//	       }
	       WebElement testleaf=driver.findElementByXPath("//*[@id='js_5a']/div");
	      // WebElement testleaf = locateElement("xpath", "((//button[contains(@class,'PageLikeButton')]/parent::span/parent::div/parent::div/parent::div/parent::span/parent::div/preceding::a)[95])");	
	   	   click(testleaf);
	   	   Thread.sleep(3000);
	   	WebElement numlike = locateElement("xpath", "//div[text()[contains(.,'people like this')]]");
		String numlike1 = numlike.getText().replaceAll("\\D", "");
		int numlikefinal = Integer.parseInt(numlike1);
		reportStep(numlikefinal+" Number of people have liked this page", "Pass");
		String title1 = getTitle();
		reportStep(title1+" is the title of the Tesleaf page in facebook" , "Pass");
		if(title1.contains("Testleaf")) {
		
			reportStep("Yes!! Testleaf text is liked succcessfull", "Pass");
		} else {
			reportStep("TestLeaf Page is laready liked", "Pass");
		}
	   	   
	       
		}
}