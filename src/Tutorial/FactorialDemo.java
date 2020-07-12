package Tutorial;

import java.util.Random;

public class FactorialDemo {
	
	

	public static void main(String[] args) {

		int r = 16;
		
		//System.out.println(Math.sqrt(r));
		
		
		Random ran = new Random();
		System.out.println(ran.nextInt(100));
		
		
		
         // 1 = 1 ==> 1
		//2 = 1*2  ==> 2
		//3 = 1*2*3 ==>3
		
		int n = 2;
		
		int l=1;  // l=2
		
		for(int i=1;i<=n;i++){
			
			l = l*i;  //l=1, i=2
			
		}
		
		
		//System.out.println(l);

	}

}
