package LoopDemo;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
                              //111213141516
      String name = "Hi Akhilesh You r awesome"; // index --> 0 ,1,2,3,4...
                   //012345678910
                    //8
                   //01234567
      
		//int a = name.length();
		
		//System.out.println(a);
		
		
		String HelloRajHowAreYou = name.substring(0,1); //il //3,5 
		
		//System.out.println(name.compareTo("Xkhilesh")); //>0 ,0, <0
		
		//System.out.println(name.indexOf("awesome"));
		
		//System.out.println(Arrays.toString(name.split(" ")));
		
		char firstChar = name.charAt(0);
		char lastChar = name.charAt(name.length()-1);
		
		//System.out.println(firstChar);
		
		//System.out.println(lastChar);
		
		//hselihkA
		
		 String name1 = "Akhilesh";  //  Akhilesh //
		 
		   name1.concat("Gupta");    // name1---> AkhileshGupta
		 
		 //System.out.println(name1); //
		 
		// String name2 = "Akhilesh"+"Gupta"; //immutable
		 
		 //StringBuffer and StringBuilder
		
		 StringBuilder sbuff = new StringBuilder(name1);// not thread safe
		 
		 //sbuff.append("Gupta");
		 
		 sbuff.reverse();
		 
		 //System.out.println(sbuff);
		 
		 
		 String name3 = "Akhilesh";
		 String output ="hselihkA";
		 
		 for(int i=name3.length()-1;i>=0;i--){
			System.out.print(name3.charAt(i));
		 }
		 
		 
		 String revOut = revName("Akash");
		 
		 System.out.println(revOut);
		
		
		
		
	}
	
	
	public static  String revName(String name){
		
		StringBuffer sbuf = new StringBuffer(name);
		
		sbuf.reverse();
			
		return sbuf.toString();
	}

}
