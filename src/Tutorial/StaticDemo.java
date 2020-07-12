package Tutorial;

public class StaticDemo {
	
	static int a;
	
	int l;

	public static void main(String[] args) {
      
		//SELECT * FROM TABLE

		System.out.println("Hi I am main method");
		//System.out.println(l);
		// Poly --> compile time (static binding), Runtime (dynamic bind)

	}
	
	static{
		//DB CONECT
		System.out.println("Hi I am static");
	}
	
	public void sum(){
		System.out.println(l);
	}

}
