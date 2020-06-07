package JavaDemoOne;

public class Box {
	
	//static and final
    static int l = 10; //class Val ; l = 12
	static int b = 20;
	int h = 30;
	
	
	public static void main(String[] args) {
	
		Box tifin1 = new Box(); // 10,20,30
		Box.l++; // 11,20,30
		Box.b++;  // 11,21,30
		tifin1.h++;  // 11,21,31
		System.out.println(Box.l); // 11
		System.out.println(Box.b);  //21
		System.out.println(tifin1.h); //31
	
		
		System.out.println("==============================================");
		
		Box tifin2 = new Box(); // 11,21,30
		
		Box.l++;    //12,21,30
		
		System.out.println(Box.l);  //12
		System.out.println(Box.b);  //21
		System.out.println(tifin2.h);  //30
		
       System.out.println("==============================================");
		
		Box tifin3 = new Box(); // 12,21,30
		
		System.out.println(Box.l);  //12
		System.out.println(Box.b);  //21
		System.out.println(tifin3.h);  //30

		
		
		
 
	}

}
