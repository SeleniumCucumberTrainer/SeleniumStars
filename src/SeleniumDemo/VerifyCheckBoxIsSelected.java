package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckBoxIsSelected {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/howto/howto_js_display_checkbox_text.asp");
		
		System.out.println("Is Checkbox select ? "+driver.findElement(By.id("myCheck")).isSelected());
		
		driver.findElement(By.id("myCheck")).click();
		
		System.out.println("Is Checkbox select ? "+driver.findElement(By.id("myCheck")).isSelected());

	}

}
