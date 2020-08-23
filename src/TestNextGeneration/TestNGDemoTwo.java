package TestNextGeneration;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGDemoTwo {
	
	WebDriver driver;
	
	
	@BeforeSuite
	public void gotFacebookProject(){
		
		System.out.println("Got Facebook Project");
		
	}
	
	
	@BeforeTest
	public void purchageLaptop(){
		
		System.out.println("Purchaging Laptop");
		
		
	}
	
	@BeforeClass
	public void purchaseInternet(){
		
		System.out.println("Purchaging Internet");
		
	}
	
	
	@BeforeMethod
	public void OpenFacebook(){
		
		System.out.println("Opening Facebook");
		
	}
	
	
	@Test
	public void doLoginTest(){
		
		System.out.println("All Facebook Tested and done!!!!");
		
	}
	
	
	@AfterMethod
	public void closeBrowser(){
		
		System.out.println("Closing Browser");
		
	}
	
	@AfterClass
	public void soldInternet(){
		
		System.out.println("Sold Internet");
		
	}
	
	
	@AfterTest
	public void soldLaptop(){
		
		System.out.println("Sold Laptop");
		
	}
	
	@AfterSuite
	public void ReleaseFacebookProject(){
		
		System.out.println("Release and Done Facebook Project");
		
	}
	

}
