package DataProviderDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelReading.Xls_Reader;

public class DataProviderDemo {
	
	
	WebDriver driver = null;
	
	@Test(dataProvider="getData")
	public void doLoginTest(String uname, String pwd){
		
		System.out.println(uname);
		System.out.println(pwd);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Jar\\driver\\chromedriver.exe");
		driver = new 	ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
		
	}
	
	@AfterMethod
	public void closeBroser(){
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData(){
		
		 Xls_Reader excel = new Xls_Reader("C:\\Users\\akhilesg\\Desktop\\Syllbus\\TestData.xlsx");
		 
		 int TotalRow = excel.getRowCount("LoginData");
		 
		 System.out.println("TotalRow--> "+TotalRow);
		 
         int ToralColumn = excel.getColumnCount("LoginData");
         
         System.out.println("ToralColumn--> "+ToralColumn);
         
         Object[][] data = new Object[TotalRow-1][ToralColumn];
         
         
         for(int i =2;i<=TotalRow;i++){ //i=3
             for(int j= 0; j<ToralColumn;j++){ //j=1
            	 
                 data[i-2][j]=excel.getCellData("LoginData", j, i);
                 
             }
         }
      
         return data;
       
}
		

}
