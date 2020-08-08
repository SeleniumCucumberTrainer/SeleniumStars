package ExceptionHandlingDemo;

public class InvalidAgeException extends RuntimeException{
	
	
	InvalidAgeException(String value){
		super(value);
	}
	

}
