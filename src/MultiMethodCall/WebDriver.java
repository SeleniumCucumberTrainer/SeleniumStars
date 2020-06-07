package MultiMethodCall;

public class WebDriver {
	
	
	public Manage manage(){
		
		return new Manage();
	}
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new WebDriver();
		
		driver.manage().window().maximize();
		
	}

}
