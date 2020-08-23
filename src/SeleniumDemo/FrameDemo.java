package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		//WebElement firstFrame = driver.findElement(By.xpath("//frame[@title='All Packages']"));
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		driver.switchTo().defaultContent();
		
        driver.switchTo().frame("classFrame");
		
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		

	}

}
