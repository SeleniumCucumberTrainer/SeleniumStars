package AbstractionDemo;

public interface InterfaceDemo{

	
	public  void sum();
	public  void add();
	public  void m1();
	public  void m2();
	public  void m3();
	

}

abstract class DemoClass implements InterfaceDemo,SecondInterface{
	
	public void sum(){
		System.out.println("HI sUM");
	}

	
	public void add() {
		
		System.out.println("Hi I am adding");
		
	}

}
