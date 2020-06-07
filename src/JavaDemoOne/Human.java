package JavaDemoOne;

public class Human {
	
	Human(){
		
	}
	
	int height =10;
	int weight = 20;
	
	// accessModifier - returnType(int,void,String,Array,Classs. etc.) - methodName 
	public int getAge(){

		return 4;
		
	}
	
	public int getAge(int a){

		return a;
		
	}
	
	public String getName(){
		
		return "Sonam";
		
	}
	
public boolean isNamingDone(){
		
		return false;
		
	}

public char getFirstChar(){
	
	return 'A';
	
}

public void done(){
	
	
	
	
}

	public static void main(String[] args) {
		
		
		Human akhilesh = new Human();
		
		
		/*int a  = akhilesh.getAge();
		
		int fatherAge = a*2;
		
		System.out.println(fatherAge);*/
		
		//CNTR+SHIFT+/
		
		
	/*	String name = akhilesh.getName();
		
		String fullName = name + " Gupta";
		
		System.out.println(fullName);
		
		akhilesh.done();
		char x = akhilesh.getFirstChar();
		boolean t = akhilesh.isNamingDone();
	*/	
		
		
		System.out.println(akhilesh.height);
		System.out.println(akhilesh.weight);
		
		int a  = akhilesh.getAge(30);
		int b  = akhilesh.getAge();
		
		System.out.println(a);
		System.out.println(b);
		
		//akhilesh.manage().window().maximize()
		//akhilesh.out.println();
		
		
	}
	
	
	

}
