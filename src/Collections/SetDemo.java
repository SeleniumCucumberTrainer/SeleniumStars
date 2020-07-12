package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

     //Iterable(I) --> Collection(I) --> Set (I) --> HashSet(C), TreeSet(C)
		
		Set<Integer> abc = new HashSet<Integer>();
		//HashSet<String> abc = new HashSet<String>();
	
		/*abc.add("Akhilesh");
		abc.add("Akhilesh");
		abc.add("Gupta");
		abc.add("is"); 
		abc.add("is"); 
		abc.add("a");
		abc.add("Tutor");*/
		
		abc.add(1);
		abc.add(5);
		abc.add(6);
		abc.add(7); 
		abc.add(2); 
		abc.add(3);
		abc.add(4);
		
		
		//System.out.println(abc);
		
		// order is not preserved
		// Duplicacy is not allowed
		
		
		/*for(String x   :  abc  ){
			System.out.println(x);
		}*/
	
	        Iterator<Integer> iter =  abc.iterator();
	        
	        while(iter.hasNext()){
	        	System.out.println(iter.next());
	        }
		
	}

}
