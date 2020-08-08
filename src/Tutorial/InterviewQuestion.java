package Tutorial;

import java.util.Scanner;

public class InterviewQuestion {

	public static void main(String[] args) {

       //Java --> I love java
	   // Selenium --> I love Selenium
		
		getFullSent();

	}
	
	public static void getFullSent(){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter value");
		
		String n1 = input.next();
		System.out.println("Please enter value");
		String n2 = input.next();
		System.out.println("Please enter value");
		String n3 = input.next();
		
		System.out.println(n1+"\n"+n2+"\n"+n3);
		
		//String name  ="This is a java world and java is very demanding";
		
	}

}
