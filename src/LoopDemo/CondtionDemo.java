package LoopDemo;

public class CondtionDemo {

	public static void main(String[] args) {


		
		// <30 failed
		// 30 to 60 --> Sec
		// >=60 --> first
		
		int mark = 56;
		
		if(mark<30){
			System.out.println("Failed");
		}
		else if(mark>=30 && mark<60){
			
			if(mark == 55){
				System.out.println("I am 55 yr old");
			}
			
			
			
		}
		else if(mark>=50){
			
			System.out.println("First");
			
		}
		
		else{
			System.out.println("Excpetional");
		}
		
		
		

	}

}
