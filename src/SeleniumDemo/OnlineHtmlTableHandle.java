package SeleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineHtmlTableHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");

		WebDriver driver = new 	ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// dynamic wait// global wait
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29074/eng-vs-pak-1st-test-pakistan-tour-of-england-2020");
		
		for(int i=3;i<=13;i++){
			
			for(int j=1;j<=7;j++){

                 String value = driver.findElement(By.xpath("//span[text()='Pakistan 2nd Innings']/ancestor::div[2]/div["+i+"]/div["+j+"]")).getText();//i=3,j=2
                 
                 System.out.print(value+"   ");
          
			}
			
			System.out.println();
			
		}
		
		
	}

}
