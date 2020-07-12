package DemoPkg;

import Encapsulation.EncapsulationDemo;

public class Hello{
	
	public static void main(String[] args) {
		
		EncapsulationDemo abc = new EncapsulationDemo();
		
		abc.setBalance(5000);
		
		System.out.println(abc.getBalance());
	}
	

}
