package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/akhilesg/Desktop/AlertDemo.html"); 
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept(); //Ok
		
		//driver.switchTo().alert().dismiss();// Cancel
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
