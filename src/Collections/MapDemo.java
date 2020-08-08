package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	
	
	//  Map (I) --> HashMap (C), TreeMap (C)

	public static void main(String[] args) {

            
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		//Map<Integer,String> abc = new HashMap<Integer,String>();
		
		map.put(11, "Akhilesh");//Entry1
//		abc.put(24, "Raghav"); //Entry2
//		abc.put(35, "Anmol");  //Entry3
//		abc.put(44, "Lav");    //Entry4
//		abc.put(51, "Sita");   // Entry5
		
		
		//System.out.println(abc.keySet());
		
		/*for(  Integer x  :   abc.keySet()){
			System.out.println(x);
		}*/
		
		//System.out.println(abc.values());
		
		//System.out.println(abc.get(21));
		
		
		for(Entry<Integer,String> x  :   map.entrySet()){
			
			System.out.println(x.getKey()+" ---> "+x.getValue());
			
			/*if(x.getValue()>1){
			 * 
			 * x.getKey()
				
			}*/
			
		}
		
	}

}
