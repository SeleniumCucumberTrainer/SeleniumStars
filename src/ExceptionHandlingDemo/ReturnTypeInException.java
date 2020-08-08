package ExceptionHandlingDemo;

public class ReturnTypeInException {
	
	public static void main(String[] args) {
		
		System.out.println(methodReturn());
		
	}
	
	
	
	public static int methodReturn(){
		
		try{
			
		  System.out.println("Hi I am in Try");
		  
		  return 10;
		
		}
		catch(Throwable t){
			
		System.out.println("Hi I am in Catch block");	
	     
	     return 20;
		}
		finally{
			
			return 30;
			
		}
		
	}

}
