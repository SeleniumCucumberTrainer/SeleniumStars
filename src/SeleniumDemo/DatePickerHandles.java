package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerHandles {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.goibibo.com/");
		
		String date = "31/12/2021";
		
		String[] allDatePart = date.split("/");
		
		String day = allDatePart[0];
		String month = allDatePart[1];
		String year = allDatePart[2];
		
		driver.findElement(By.xpath("(//i[contains(@class,'hypflt-calendar')])[1]")).click();// icon
		
		//driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();// next
		
	while(true){
		
		try{
		
		driver.findElement(By.id("fare_"+year+month+day)).click(); // search date and click
		
		break;
		
		}catch(Exception t){
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();
			
		}
		
	}

	}

}
