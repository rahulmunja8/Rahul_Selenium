package Project_Day;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class TC002 extends ProjectMethods {
@BeforeTest
	public void SetData() {
		testCaseName="TC002_Zoom Car";
		testCaseDesc="Book car in Zoom Car";
			category="smoke";
			author="Rahul Munjal";
	}


@BeforeMethod
public void login() {
	startApp("chrome", "https://www.zoomcar.com/chennai");
	WebElement startJourney = locateElement("linkText", "Start your wonderful journey");
	click(startJourney);
	
}

@Test

public void booking() {
	WebElement popularPickup = locateElement("xpath","(//div[@class=\"component-popular-locations\"]/*[3])");
	click(popularPickup);
	WebElement next = locateElement("class", "proceed");
	click(next);
	// Get the current date
			Date date = new Date();
	// Get only the date (and not month, year, time etc)
			DateFormat sdf = new SimpleDateFormat("dd"); 
	// Get today's date
			String today = sdf.format(date);
	// Convert to integer and add 1 to it
			int tomorrow = Integer.parseInt(today)+1;
	// Print tomorrow's date
			System.out.println(tomorrow);
			WebElement nextday = locateElement("xpath","(//div[text()[contains(.,'"+tomorrow+"')]])");
			click(nextday);
			
			WebElement next1 = locateElement("class", "proceed");
			click(next1);
			WebElement done = locateElement("class", "proceed");
			click(done);
			List<WebElement> results = driver.findElementsByClassName("car-item");
			int noOfResults = results.size();
			System.out.println("The Number of Results are "+(noOfResults));
			List<WebElement> Price = driver.findElementsByClassName("price");
			List<Integer> allPrices = new ArrayList<Integer>();
			for (WebElement eachPrice : Price) {
				allPrices.add(Integer.parseInt(eachPrice.getText().replaceAll("\\D", "")));
			}
			int maxValue = Collections.max(allPrices);
			WebElement MaxBrand = locateElement("xpath","(//div[@class='car-book']//div[contains(text(), '"+maxValue+"')]/preceding::div[@class='details'][1]/h3)");
			String text = getText(MaxBrand);
			System.out.println(text);
			WebElement bookNow = locateElement("xpath","(//div[@class='car-book']//div[contains(text(), '"+maxValue+"')]/following-sibling::button)");
			click(bookNow);
}
	
}
