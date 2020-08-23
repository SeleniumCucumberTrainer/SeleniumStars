package SeleniumDemo.ListnerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class ClickDemoWithListner {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver_old = new 	ChromeDriver();
		
		EventFiringWebDriver driver = new EventFiringWebDriver(driver_old);
		
		WebListner listning = new WebListner();
		
		driver.register(listning);
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		//WebElement firstFrame = driver.findElement(By.xpath("//frame[@title='All Packages']"));
		
		driver.switchTo().frame("packageListFrame");
		
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();

	}

}
