package LoopDemo;

import JavaDemoOne.Box;

public class ContinueDemo {
	
	static int l =10;

	public static void main(String[] args) {
		
		
		
		String a = "Akhilesh"; // only 1 object  y -->cost String pool
		//String abc  = new String("Akhilesh"); // heap new String() --> x -->y ="Akhilesh" cost String pool
		
		String y = "Akhilesh";
		
		System.out.println(a.hashCode());
		System.out.println(y.hashCode());
		
		//String abc  = new String("Akhilesh"); // 2 object // heap new String() --> x -->y ="Akhilesh" 
		String xyz  = new String("Akhilesh");
		String abc  = new String("Akhilesh");
		
		System.out.println(xyz.hashCode());
		System.out.println(abc.hashCode());
		//System.out.println(a == abc); //
		//System.out.println(a == y);
		//System.out.println(xyz == abc);
		
		//System.out.println(a.equals(abc));
		System.out.println(xyz.equals(abc));
		
		// RAM -- 4gb --> 200 mb (JVM)
		// Heap (100mb)--> actual Object goes to Heap(75mb) --> constant sTRING POOL(25mb)
		// Stack --> but ref variable goes to Stack
		// Static/method area
		
		
		
		
		
		
	
		
		/*String c = String.valueOf(a);
		
		System.out.println(c.substring(6));
		
		//System.out.println(Integer.parseInt(c)*2);
		
		
		int a = 1%3;
		
		System.out.println(a != 0); //!= --> not equal , == --> equal
*/

//		for (int i = 1; i <= 2; i++) {
//			
//			//i =2
//
//			for (int j = 1; j <= 6; j++) {
//				
//				if(j%3==0){
//				continue;
//				}
//				System.out.println(j);
//
//			}
//
//			System.out.println("Hi Akhilesh");
//
//		}
	}

}
