package SeleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/"); 
		
		driver.findElement(By.linkText("Instagram")).click();
		
		String parentWindowId = driver.getWindowHandle();
		
		System.out.println(parentWindowId);
		
	    Set<String> allWindowId  = driver.getWindowHandles();
	    
	    System.out.println(allWindowId);
	    
	    for( String id : allWindowId  ){
	    	
	    	if(id != parentWindowId){
	    		
	    		driver.switchTo().window(id);
	    		
	    	}
	    	
	    }
	    
		driver.findElement(By.name("username")).sendKeys("Selenium");// in new Window, need to write Selenium

		driver.close();
		
		Thread.sleep(4000);
		
		driver.switchTo().window(parentWindowId);
		
		//driver.switchTo().defaultContent();//frame
		
		driver.findElement(By.name("firstname")).sendKeys("Akhilesh");
	}
	

}
