package InheritanceDemo;

 public class CheckInheritance {
	 	 
	 
	 public static void main(String[] args) {
		
		 Child1 child = new Child1();
		 
		 child.sing();
		 
		 /*Parent parent  = new Parent();
		 
		 parent.sing();*/
		 
	}
	

}

class Parent{
	
	int a;
	
	 Parent(){
	
		System.out.println("Hi Parent Constructor ");
	
	}
	
	public void sing(){
		
		System.out.println("Parent is dancing");
		
	}
	
	
}
  
class Child1 extends Parent{
	  
	 public Child1(){
  
		System.out.println("Hi Child Constructor");
		
	}
	
	
  }

class Child2 extends Parent{
	  
	 public Child2(){
 
		System.out.println("Hi Child Constructor");
		
	}
	
	
 }

class Child3 extends Parent{
	  
	 public Child3(){
 
		System.out.println("Hi Child Constructor");
		
	}
	
	
 }

class Child4 extends Parent{
	  
	 public Child4(){
 
		System.out.println("Hi Child Constructor");
		
	}
	
	
 }
