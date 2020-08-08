package SeleniumDemo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotDemo {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.paypal.com/");// rotate 
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(screenshotFile, new File("C:\\Jar\\Screenshot\\homepage.png"));

		
		
		
	}

}
