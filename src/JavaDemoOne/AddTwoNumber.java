package JavaDemoOne;

public class AddTwoNumber {

	public static void main(String[] args) {
		
	byte a =  127;      // 1 byte = 8 bit (00000000)  // 2^8 => 256 => -128,-127,-126 ----0-----126, 127 
	//byte b = 20;
	
	
	//short x = 30;      // 2 byte = 16 bit  // 2^16  // 12456/2 -6228 ------- 0 ------6227
	
	//int c = 100;   // 4 byte = 32 bit // 2^32 
	
	//byte c = a+b;
	
	//integral data type --> int
	// boolean -> true or false
	// char --> 
	
	//char y = ' ';
	
	//String name = "Akhilesh";
	
	System.out.println();
	
	// Primitive , non - primitive
	
	//int t = 10;
	
	//++t; // t = t + 1
	
	//System.out.println(++a); // a=127+1;
	//System.out.println(++a);
	
	/*int y = 10; //11
		
	System.out.println(y++); // y = y+1 // y = 10+1 ; y=11
	
	System.out.println(++y); // y = 11+1  // y =12
	
	System.out.println(y++); // y = y+1  // y = 12+1
*/	
	
	int r = 10;
	
	//int y = r++ + r++; // 10   + 11
	
	int y = r++ + r--; // 10 ;r=r+1 r=10+1 r=11 +   11;    r=r-1 , r =11-1 , r=10
	
	
	
	int t = r++ + --r + r++;
	    t = ++r + r-- + --r;
	
	
	System.out.println(t); //21 //20
	System.out.println(r); //10 //11
	
	
	
	
	
	
	
	
	
		
	
		
	}

}
