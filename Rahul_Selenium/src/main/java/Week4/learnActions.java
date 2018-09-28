package Week4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class learnActions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions builder = new Actions(driver);
		WebElement frame = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElementById("draggable");
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
	
		builder.dragAndDropBy(drag, x+100, y+100).perform();
		
		

	}

}