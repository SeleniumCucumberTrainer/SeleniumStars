package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		
		//Iterable(I) --> Collection(I) --> Set (I) --> HashSet(C), TreeSet(C)
		
				Set<String> abc = new TreeSet<String>();
				//HashSet<String> abc = new HashSet<String>();
			
				abc.add("Akhilesh");
				abc.add("Bipin");
				abc.add("Abay");
				/*abc.add("3"); 
				abc.add("1"); 
				abc.add("8");
				abc.add("10");
				*/
				
				//System.out.println(abc);
				
				// order is not preserved
				// Duplicacy is not allowed
				
				
				/*for(String x   :  abc  ){
					System.out.println(x);
				}*/
			
			        Iterator<String> iter =  abc.iterator();
			        
			        while(iter.hasNext()){
			        	System.out.println(iter.next());
			        }
				
			}
		
		
		
		
	}


