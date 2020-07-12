package Tutorial;

public class FibonacciSeries {

	public static void main(String[] args) {

       //0,1,1,2,3,5,8,13........
		
		int number = 10;
		
		
		int a = 0;
		int b = 1;
		
		System.out.println(a+"\n"+b);
		
		while(number>=0){
			
		int c = a+b;
		
		a=b;
		b=c;
		
		System.out.println(c);
		
		number--;
		}
	}

}
