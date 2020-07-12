package ArrayDemo;

import InheritanceDemo.CheckInheritance;

public class ArrayPractice {

	public static void main(String[] args) {

       
       //int [] array =  new int[3]; // [0][0][0][0]
       
       //int array[] = new int[4];
       
       /*array[0] = 10;
       array[1] = 20;
       array[2] = 30;*/
		
		int[] array ={2,3,8,5,6}; //{6,5,8,3,2}//
		
		String[] aarays = {"Akhilesh","Gupta","Kumar"};
      
		int len = array.length;
		//System.out.println(len);
		
		for(int i =len-1; i>=0; i--){
			
			System.out.println(array[i]);
			
		}
		
		/*for( int r   :  array){
			
			System.out.println(r);
			
		}*/
		
		/*for( String t  : aarays ){
			
			System.out.println(t);
			
		}*/
     

	}

}
