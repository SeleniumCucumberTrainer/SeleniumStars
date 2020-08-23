package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("http://deluxe-menu.com/popup-mode-sample.html");// rotate 
		
		Actions action = new Actions(driver);
		
		WebElement image = driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		
		action.contextClick(image).perform();
		
		WebElement ProductInfo  = driver.findElement(By.id("dm2m1i1tdT"));
		
		action.moveToElement(ProductInfo).perform();
		
		Thread.sleep(2000);
		
		WebElement Installation = driver.findElement(By.id("dm2m2i1tdT"));
		
		action.moveToElement(Installation).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("dm2m3i0tdT")).click();

	}

}
