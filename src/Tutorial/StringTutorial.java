package Tutorial;

public class StringTutorial {

	public static void main(String[] args) {

     String name = "NITIN";
     
     String reverse = "NITIN";
     
     if(name.equals(reverse)){
    	 System.out.println("Its Polyndrome");
     }
     
     if(name == reverse){
    	 System.out.println("Its Polyndrome");
     }
     
     if(name.compareTo(reverse) == 0){
    	 System.out.println("Its Polyndrome");
     }
		
		

	}

}
