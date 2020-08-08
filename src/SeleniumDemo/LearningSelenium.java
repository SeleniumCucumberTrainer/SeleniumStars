package SeleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class LearningSelenium {

	public static void main(String[] args) throws InterruptedException, IOException {
   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");// rotate 
		
		try{
		
        driver.findElement(By.id("loginbutton1")).submit();
        
		}
        catch(Exception t){
        	
        Thread.sleep(2000);
        
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
      		FileHandler.copy(screenshotFile, new File("C:\\Jar\\Screenshot\\facebook.png"));
        
        }
        
		//driver.findElement(By.linkText("Sign Up")).click();
		//driver.findElement(By.linkText("Sign Up for Free")).click();
        
     
		
        
        //2 sec
        
        Thread.sleep(4000);//hard wait, static wait, unit is in milisec
        
        //driver.findElement(By.xpath("//span[text()='Business Account']")).click();// 500 miliSec
        
        
        
        
        
        
        
        
        Thread.sleep(5000);
		
		//driver.close();
        
        driver.quit();
		
		
		
		
		
		
		
		
		

	}

}
