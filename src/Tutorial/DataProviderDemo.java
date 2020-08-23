package Tutorial;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	
	@Test(dataProvider="getData")
	public void testLogin(String Username,String password){
		
		System.out.println(Username+"  "+password); 
				              
		
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[2][2];
		
		data[0][0] ="seleniumbesttrainer@gmail.com";
		data[0][1] ="itcm1234";
		data[1][0] ="trainer@gmail.com";
		data[1][1] ="trainer";
		
		return data;
		
	}

}
