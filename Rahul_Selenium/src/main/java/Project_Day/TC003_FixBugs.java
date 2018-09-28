package Project_Day;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC003_FixBugs {

	@Test
	public void fixBug() throws InterruptedException {

		// launch the browser
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");

		// Mouse Over on Men
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElementByLinkText("Men")).perform();

		// Click on Jackets
		driver.findElementByXPath("//a[@href='/men-jackets']").click();


		// Find the count of Jackets
		String leftCount = 
				//Bug Found following:sibling replaced by following-sibling
				driver.findElementByXPath("//input[@value='Jackets']/following-sibling::span")
				.getText()
				.replaceAll("[^0-9]", "");
		System.out.println(leftCount);


		// Click on Jackets and confirm the count is same
		driver.findElementByXPath("//label[text()='Jackets']").click();

		// Wait for some time
		Thread.sleep(5000);

		// Check the count
		//fixed bug
		String rightCount = 
				driver.findElementByXPath("//h1[text()='Mens Jackets']/following-sibling::span")
				.getText()
				.replaceAll("[^0-9]", "");
		System.out.println(rightCount);

		// If both count matches, say success
		if(leftCount.equals(rightCount)) {
			System.out.println("The count matches on either case");
		}else {
			System.err.println("The count does not match");
		}

//		// Click on Offers Not available in page so commented
//		driver.findElementByXPath("//h3[text()='Offers']").click();
		
//WebElement SortBy = driver.findElementByClassName("sort-sortBy");
//Select dropdown = select(SortBy);
//dropdown.selectByVisibleText("Price: High to Low");


		// Find the costliest Jacket
		
		List<WebElement> productsPrice = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
		List<String> onlyPrice = new ArrayList<String>();

		for (WebElement productPrice : productsPrice) {
			onlyPrice.add(productPrice.getText().replaceAll("//D", ""));
		}

		// Sort them 
		String max = Collections.max(onlyPrice);

		// Find the top one
		System.out.println(max);
		
		

		// Print Only Allen Solly Brand Minimum Price
		WebElement moreBrands = driver.findElementByClassName("brand-more");
		moreBrands.click();
		
		
		driver.findElementByXPath("//input[@value='Allen Solly']/following-sibling::div").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@class='FilterDirectory-searchInput']/following-sibling::span").click();
		Thread.sleep(1000);
		// Find the costliest Jacket
		List<WebElement> allenSollyPrices = driver.findElementsByXPath("//span[@class='product-discountedPrice']");

		List<String>onlyPrice1 = new ArrayList<String>();

		for (WebElement productPrice : allenSollyPrices) {
			onlyPrice1.add(productPrice.getText().replaceAll("//D", ""));
		}

		// Get the minimum Price 
		String min = Collections.min(onlyPrice1);

		// Find the lowest priced Allen Solly
		System.out.println(min);
		driver.close();

	}

}