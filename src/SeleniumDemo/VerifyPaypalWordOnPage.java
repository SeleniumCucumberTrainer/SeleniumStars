package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPaypalWordOnPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/"); 
		
		try{
		
		driver.findElement(By.xpath("//*[contains(text(),'PayPal')]"));
		
		System.out.println("Paypal word is Available");
		
		}catch(Exception t){
			System.out.println("Paypal word is not Available");
		}

	}

}
