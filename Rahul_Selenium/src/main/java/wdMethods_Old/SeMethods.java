package wdMethods_Old;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	public RemoteWebDriver driver;
	public int i = 1;
	//we are using this in Alert() methods.
//	public Alert AlertHandle = driver.switchTo().alert();

	public void startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver  = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver  = new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser "+browser+" launched successfully");
		} catch (WebDriverException e) {
			System.err.println("WebDriverExecption Occured");
			throw new RuntimeException("WebDriverExecption Occured");
		}
		catch(NullPointerException e) {
			System.err.println("NullPointerExecption Occured");
			throw new RuntimeException("NullPointerExecption Occured");
		}
		catch(Exception e) {
			System.err.println("Execption Occured");
			throw new RuntimeException("Execption Occured");
		}
		finally {
			takeSnap();
		}
	}


	public WebElement locateElement(String locator, String locValue) {
		try {
			switch (locator) {
			case "id": return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);
			case "linktext": return driver.findElementByLinkText(locValue);
			case "name":return driver.findElementByName(locValue);
			}
		} catch (NoSuchElementException e) {
			System.err.println("No Such Element Exception occured");
			throw new RuntimeException("No Such Element Exception Occured");

		}
		catch(Exception e)
		{
			System.err.println("Exception occured");
			throw new RuntimeException("Exception Occured");
		}
//		finally {
//			takeSnap();
//		}
		return null;
	}


	public WebElement locateElement(String locValue) {		
		WebElement findElementById = null;
		try {
			findElementById = driver.findElementById(locValue);
		} catch (NoSuchElementException e) {
			System.err.println("NoSuchElementException occured");
			throw new RuntimeException("No Such Element Exception Occured");
		}
		catch (Exception e) {
			System.err.println("Exception occured");
			throw new RuntimeException("Exception Occured");
		}
		finally {
			takeSnap();
		}

		return findElementById;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is entered Successfully");
		} catch (ElementNotVisibleException e) {
			System.err.println("Element Not Visible Exception occured");
			throw new RuntimeException("Element Not Visible Exception Occured");
		}

		catch (Exception e) {
			System.err.println("Exception occured");
			throw new RuntimeException("Exception Occured");
		}
		finally
		{
			takeSnap();
		}

	}


	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();
	}


	public String getText(WebElement ele) {
		takeSnap();
		
		return ele.getText();
		
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		Select dd = new Select(ele);
		dd.selectByVisibleText(value);
		takeSnap();
	}
	
	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select dd2 = new Select(ele);
		dd2.selectByValue(value);
		takeSnap();
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		Select dd1 = new Select(ele);
		dd1.selectByIndex(index);
		takeSnap();
	}

	@Override
	public boolean verifyTitle(String expectedTitle) {
		boolean bReturn=false;
		String title = driver.getTitle();
		if(title.equals(expectedTitle))
		{
			bReturn=true;
		}
		takeSnap();
		return bReturn;
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if(text.equals(expectedText))
		{
			System.out.println("Verified text for " +ele+ " is correct");
		}
		else 
		{
			System.out.println("Verified text for " +ele+ " is incorrect");
		}
		takeSnap();
	}

	@Override
	public void verifyPartialText(WebElement ele, String expectedText) {
		String text = ele.getText();
		if(text.contains(expectedText))
		{
			System.out.println(ele+ " text contains" +expectedText);
		}
		else 
		{
			System.out.println(ele+ " text contains" +expectedText);
		}	

	}

	@Override
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		String attri2 = ele.getAttribute(attribute);
		if(attri2.equals(value))
		{
			System.out.println("The value of Attribute "+attribute+"is correctly verified");
		}
		else {
			System.out.println("The value of Attribute "+attribute+"is incorrect");
		}

	}

	@Override
	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		String attri2 = ele.getAttribute(attribute);
		if(attri2.contains(value))
		{
			System.out.println("The Attribute "+attribute+" contains text"+value);
		}
		else {
			System.out.println("The Attribute "+attribute+" does not contains text"+value);
		}

	}

	@Override
	public void verifySelected(WebElement ele) {
		if (ele.isSelected()) {
			System.out.println("The checkbox is selected");

		}
		else {
			System.out.println("The checkbox is not selected");
		}
		takeSnap();

	}

	@Override
	public void verifyDisplayed(WebElement ele) {
		

	}

	@Override
	public void switchToWindow(int index) {
		Set<String> Windows = driver.getWindowHandles();
		List<String> AllWindows = new ArrayList<String>();
		AllWindows.addAll(Windows);
		String WindowToSwitch = AllWindows.get(index);
		driver.switchTo().window(WindowToSwitch);
		takeSnap();
	}

	@Override
	public void switchToFrame(WebElement ele) {

		driver.switchTo().frame(ele);
		System.out.println("Switched to required frame");


	}

	@Override
	public void acceptAlert() {
		//AlertHandle is the variable declared at class level on top for re-usability.
		driver.switchTo().alert().accept();
	}

	@Override
	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	@Override
	public String getAlertText() {

		String AlertText = driver.switchTo().alert().getText();
		return AlertText;
	}


	public void takeSnap() {
		try {
			File src = driver.getScreenshotAs(OutputType.FILE);
			File desc = new File("./snaps/img"+i+".png");		
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			
			System.err.println("IO Exception occured");
		}
		i++;
	}

	@Override
	public void closeBrowser() {
		driver.close();

	}

	@Override
	public void closeAllBrowsers() {
		driver.quit();

	}

}
