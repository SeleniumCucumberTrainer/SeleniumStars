package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/"); 
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'interview questions')]")));
		
		driver.findElement(By.xpath("//*[contains(text(),'interview questions')]")).click();

	}

}
