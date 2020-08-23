package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		/*driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
		
		
		Actions action = new Actions(driver);
		
		action.dragAndDropBy(slider, 400, 0).perform();		
*/
		
		
		
		
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		
		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		
        Actions action = new Actions(driver);
		
		action.dragAndDropBy(resizable, 200, 200).perform();	
		
		
		
		
		
		
	}

}
