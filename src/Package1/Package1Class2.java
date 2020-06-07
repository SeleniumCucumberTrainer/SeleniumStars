package Package1;

public class Package1Class2 {
	
	 int a =10;
	 static int b =20;
	
	public static void main(String[] args) {
		
		
		
		Package1Class1 abc = new Package1Class1();
		
		abc.sum();
		
		//Package1Class2.add();
		
		add();
		
	}
	
	
	public static void add(){
		
		System.out.println(Package1Class2.b);
		
		Package1Class2 xyz = new Package1Class2();
		
		System.out.println(xyz.a);
		xyz.sub();
	
	}
	
	public void sub(){
		
		
		add();
		System.out.println(a);
		System.out.println(b);
		
	}
	

}
