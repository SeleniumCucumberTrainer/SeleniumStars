package Tutorial;

import SysoutLogin.SysoutDemo;

public class ParentChildDemo {

	public static void main(String[] args) {
		
	
		/*Child abc = new Child();
		abc.add();
		abc.sum();
		abc.mul();
		
		Parent xyz = new Child();//9 method ( Object )+ 2 (Parent) + 1 Child
		
		xyz.sum();
		xyz.mul();
		
		Parent ret = new Parent();// 9 method ( Object )+ 2 (Parent)
		
		ret.sum();
		ret.mul();
		
		Object obj= new Child();// 9 method ( Object )+ 2 (Parent) + 1 Child
*/		
	
		Parent driver  = new Parent();
		//Child  xyz = new Child();
		//GrandChild ret = new GrandChild();
		//Webdriver driver  = new FirefoxDriver(); //click
		//FirefoxDriver driver1  = new FirefoxDriver();//click, hello
		//ChromeDriver driver2  = new ChromeDriver();//click,
		//InternetExp driver3  = new InternetExpDriver();//click

		if("Child".contains("Child")){
			
			driver = new Child();
		}
        if("GrandChild".contains("Grand")){
			
        	driver = new GrandChild();
		}
        
		System.out.println(driver instanceof Parent);
		System.out.println(driver instanceof Child);
		System.out.println(driver instanceof GrandChild);
		

	}

}

class Parent{
	
	public void click(){
		System.out.println("Hi Parent click");
	}
	public void mul(){
		System.out.println("Hi Parent mul");
	}
}
class Child extends Parent{
	
	public void click(){
		System.out.println("Hi Child advance click");
	}
	public void add(){
		System.out.println("Hi Child add");
	}
}

class GrandChild extends Child{
	
	public void click(){
		System.out.println("Hi Child more advance click");
	}
	
	public void sub(){
		System.out.println("Hi GrandChild sub");
	}
}
