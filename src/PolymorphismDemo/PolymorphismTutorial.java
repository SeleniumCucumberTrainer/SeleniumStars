package PolymorphismDemo;

import DemoPkg.Hello;

public class PolymorphismTutorial {
	
	static int a;
	
	public PolymorphismTutorial(){
		
	}
	
	public PolymorphismTutorial(int a){
		
	}
	
	
    // overloaded
	public void sum(int a) {


	System.out.println(a+2);	
		

	}

	//overloading
	public void sum(int a, int b){
		
		System.out.println(a+b);	
		
		
		
	}
	
public int sum(int a, int b, int c){
		
		System.out.println(a+b+c);	
		
		return 1;
		
	}

public void sum(int a, int b, int c, int d){
	
	System.out.println(a+b+c+d);	
		
}
    
    // Overload --> early / compiletime polymorphism--> methodName must be same but parameter/signature must be different
	//                1. access modifier, and return type could be diff
	//                2. Overloading can happen in same class and can happen in child class as well
	
    // Override -->  late / runtime polymorphism -->
	//                 1. only happen in child class.
	//                 2. methodName must be same and same parameter/signature
    
    public static void main(String[] args) {
    	
    	//PolymorphismTutorial abc  = new PolymorphismTutorial();
    	//abc.sum(1,2,4,5);
    	
    	Child xyz = new Child();
    	
    	
    
    	
    	
		
	}

}



class Parent extends Object{
	
	 protected Object sum(){
		
		 return new Object();	
	}
      
}

class Child extends Parent{
	
	
	
}








