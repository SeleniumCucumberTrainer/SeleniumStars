package SeleniumDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTotalLinksOnPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement firstElement  = driver.findElement(By.tagName("a"));
		
		List<WebElement>  allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println(allLinks.size());
		
//		for( WebElement link   : allLinks  ){
//			
//			System.out.println(link.getText());`
//		}
		
       for( WebElement link   : allLinks  ){
			
			System.out.println(link.getAttribute("class"));
		}
		
	}

}
