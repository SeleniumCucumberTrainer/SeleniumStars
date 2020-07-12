package Tutorial;

public class PowerOfNumber {

	public static void main(String[] args) {

		System.out.println(powerOfNumber(3,2));

	}
	
	
	public static int powerOfNumber(int num, int power){ // num =2, power =3
		
		int finalNum = 1;   //finalNum = 8
		
		while(power>0){
			
			finalNum = num*finalNum; // 2*4
			
			power--;
			
		}
		
		return finalNum;
		
	}

}
