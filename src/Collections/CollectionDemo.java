package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
	
	
	 // Collection (I), Collections (Class)
	
	// Iterable(I) --> Collection(I) --> List (I) --> ArrayList (C), LinkedList (C)
	
	
	static String output="";
	
	
	public static void main(String[] args) {
		
		//ArrayList<String> abc = new ArrayList<String>();
		
		List<String> abc = new ArrayList<String>();
		
		//System.out.println(abc.size());
		
		/*int[] arr = new int[2]; //[][][][][][][][][][][][][
		
		arr[0] = 10;
		arr[1] = 21;
		arr[2] = 22;*/
		
		/*Object[] str = new Object[3];
		
		str[0] =1;
		str[1] ="Akhilesh";
		str[2] = true;*/
		
		abc.add("Akhilesh");
		abc.add("Gupta");
		abc.add("is");
		abc.add("a");
		abc.add("Tutor");
		
		System.out.println(abc);
		
		//String output = "Akhilesh Verma is a Tutor";
		
		//System.out.println(abc.size());
		
		//System.out.println(abc.get(4));
		
		/*for(int i=0;i<abc.size();i++){
			System.out.println(abc.get(i));
		}*/
		
		/*for( String  x  :   abc  ){
		System.out.println(x);
		
		}*/
		
//		Iterator<String>  itr = abc.iterator();
//		
//	     while(itr.hasNext()){
//	    	 
//	    	 String st = itr.next();
//	    	 
//	    	 output =output+st+" ";
//	    	 
//	     }
//		
//		System.out.println(output);
		
	}

}
