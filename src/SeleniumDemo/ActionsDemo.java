package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		WebElement jobElement = driver.findElement(By.xpath("//div[text()='Jobs']"));
//		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(jobElement).perform();
		
		driver.findElement(By.id("email")).sendKeys("seleniumbesttrainer@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("asdsadsadsad");
		
		
		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(5000);
		
		
		
	String currentUrlOpened = driver.getCurrentUrl();
	
	System.out.println(currentUrlOpened);
	
	
	driver.get(currentUrlOpened);
		
		
		
	/*	actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(3000);
		
		actions.sendKeys(Keys.PAGE_UP).perform();
		
		
		actions.sendKeys(Keys.F5).perform();*/
		
		
		
		
	}
	
	

}
