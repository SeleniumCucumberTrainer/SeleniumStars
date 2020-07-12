package Collections;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	
		public static void main(String[] args) {

            
			TreeMap<Integer,String> abc = new TreeMap<Integer,String>();
			//Map<Integer,String> abc = new TreeMap<Integer,String>();
			
			abc.put(11, "Akhilesh");//Entry1
			abc.put(24, "Raghav"); //Entry2
			abc.put(35, "Anmol");  //Entry3
			abc.put(44, "Lav");    //Entry4
			abc.put(51, "Sita");   // Entry5
		
		
			
			
			//System.out.println(abc.keySet());
			
			/*for(  Integer x  :   abc.keySet()){
				System.out.println(x);
			}*/
			
			//System.out.println(abc.values());
			
			//System.out.println(abc.get(21));
			
			
			Set<Entry<Integer,String>> allEntry= abc.entrySet();
			
			for( Entry<Integer,String> x  :   allEntry   ){
				
				System.out.println(x.getKey()+" ---> "+x.getValue());
				
			
		}
	}

}
