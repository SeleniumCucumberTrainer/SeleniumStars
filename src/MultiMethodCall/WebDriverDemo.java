package MultiMethodCall;

public class WebDriverDemo {
	
	
	public Manage manage(){
		
		return new Manage();
	}
	
	
	public static void main(String[] args) {
		
		WebDriverDemo driver = new WebDriverDemo();
		
		driver.manage().window().maximize();
		
	}

}
