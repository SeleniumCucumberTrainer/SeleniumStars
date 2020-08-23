package SeleniumDemo.ListnerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class WebListner extends AbstractWebDriverEventListener{
	
	
	public void beforeClickOn(WebElement element, WebDriver driver){
		
		System.out.println("Taking screenshot");
		System.out.println("Hi screenshot");
		System.out.println("Hello screenshot");
		
		
		
	}

}
