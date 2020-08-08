package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVarification {

	public static void main(String[] args) {
		// product-hero__paragraph
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/"); 
		
		String text = driver.findElement(By.className("product-hero__paragraph")).getText();
		
		System.out.println(text);
		
		if(text.contains("200")){
			System.out.println("Test case Passed");
		}
		else{
			System.out.println("Test case Failed");
		}

	}

}
