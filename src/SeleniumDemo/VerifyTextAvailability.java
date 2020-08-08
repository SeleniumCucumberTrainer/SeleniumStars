package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTextAvailability {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		try{
//		
//		driver.findElement(By.xpath("//*[text()='Facebook']"));
//		
//		System.out.println("Element found");
//		
//		}catch(Exception t){
//			System.out.println("Element not found");
//		}
		
		boolean isFound = driver.findElement(By.xpath("//*[text()='Facebook']")).isDisplayed();
		
		if(isFound){
			System.out.println("Yes Element found");
		}
		else System.out.println("Element not found");
		

	}

}
