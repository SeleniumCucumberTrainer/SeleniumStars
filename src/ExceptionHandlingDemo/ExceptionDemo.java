package ExceptionHandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionDemo {
	
	
	//Throwable (C) <-- Exception(C) <-- RuntimeException (Uncheck Exc)(C) and CompileTimeException (CheckedExc)
	//Throwable (C) <-- Error (C)
	
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter value of A");
		int a = input.nextInt();
		System.out.println("Please enter value of B");
		int b = input.nextInt();
		int c =-1;
		try{
			
			try{}
			catch(Throwable t){
				
			}
		 c = a/b;
		
		}
		catch(NullPointerException t){
			System.out.println("Hello NullPointerException");
			try{}
			catch(Throwable r){
				
			}
			
		}
		catch(ArithmeticException t){
			System.out.println("Hello ArithmeticException");
			try{
				try{}
				catch(Throwable j){
					
					try{}
					catch(Throwable g){
						
					}
				}
			
			}
			catch(Throwable d){
				
			}
			
		}
		catch(Exception t){
			System.out.println("Hello Exception");
			try{}
			catch(Exception e){
				
			}
            catch(Throwable y){
				
			}
			finally{
				
			}
			
		}
		catch(Throwable t){
			System.out.println("Hello Throwable");
			try{}
			finally{
				
			}
            	
		}
		
		

	}

}
