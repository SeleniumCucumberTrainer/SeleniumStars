package Tutorial;

import java.util.Arrays;

public class WordReverse {

	public static void main(String[] args) {

       String name = "This is Ram";
       //String output = "siht si maR";
       
       String output ="";// sihT si Mar
       String[] allWords = name.split(" "); //[This][is][Ram]
       
     for( String x : allWords  ){
    	 
    	 StringBuffer bf = new StringBuffer(x); // Ram
    	 String reverse = bf.reverse().toString(); // maR
    	 output = output + reverse+" "; // output =  sihTsi+ Mar
    	
     }
       
		System.out.println(output);
		

	}

}
