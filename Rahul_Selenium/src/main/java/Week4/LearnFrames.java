package Week4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement frame = driver.findElementById("iframeResult");
		driver.switchTo().frame(frame);
		WebElement TryIt = driver.findElementByXPath("//button[text()='Try it']");	
		
		TryIt.click();
		driver.switchTo().alert().sendKeys("Rahul Munjal");
		driver.switchTo().alert().accept();

	}

}
