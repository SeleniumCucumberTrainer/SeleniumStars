package TestNextGeneration;

import org.testng.annotations.Test;

public class TestNGDemo {

	

	
	    @Test(priority=1,groups="Smoke",description="This is my first test case")
        public void verifyuploadPic(){
    	
    	System.out.println("Hi Pic has been uploaded successfully!!!!!!");
    	
        }
	    
	    
        @Test(priority=3,groups="Sanity")
		public void verifyLoginIntoFacebook(){
			
			System.out.println("Hi I have successfully logged-in");
			
		}
        
        @Test(priority=2,groups="Regression")
		public void verifyPostUpdate(){
			
			System.out.println("Hi I have posted my message successfully");
			
		}
        @Test(priority=2,groups="Smoke")
		public void verifyEmailSend(){
			
			System.out.println("Hi I have sent email successfully");
			
		}
        
        
        
     
        
        
		
		
		
		
		
		

	

}
