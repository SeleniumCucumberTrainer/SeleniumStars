package Tutorial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

                     //0,1,2
		int[] array = {5,6}; //[8,7,6,7]
		
		System.out.println(Arrays.toString(array));
		
		int len = array.length;
		
		for(int i =0;i< array.length/2;i++){
					
			int temp = array[i];  // temp = 5
			array[i] = array[len-1-i];  // array[0] = 7
			array[len-1-i] = temp ;    // array[2] = temp
			
		}
		
	   System.out.println(Arrays.toString(array));

	}

}
