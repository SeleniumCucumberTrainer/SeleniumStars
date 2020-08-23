package TestNextGeneration;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTutorial {
	
	
	@Test
	public void bookTicket(){
		
		System.out.println("Booking Ticket");
		
	}
	
	@Test
	public void watchingMovie(){
		
		System.out.println("Watching movie");
		
	}
	
	@BeforeMethod
	public void purchagePopCorn(){
		
		System.out.println("Purchaging Popcorn");
		
	}
	
	@BeforeTest
	public void dancing(){
		System.out.println("Hi Dancing");
	}

}
