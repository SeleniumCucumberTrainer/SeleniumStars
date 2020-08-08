package ExceptionHandlingDemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowExceptionDemo {

	public static void main(String[] args) throws SQLException, ArithmeticException, IOException {

       int age = 81;
       
       if(age<18){
    	   
    	   throw new InvalidAgeException("Hi your age is less than 18");
       }
		
		
       if(age>80){
    	   
    	   throw new IOException();
    	   
       }
       
       if(age>90){
    	   
    	   throw new SQLException();
    	   
       }

	}

}
