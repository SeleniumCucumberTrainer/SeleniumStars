package AbstractionDemo;

public abstract class Mobile {
	
	//abstract, Interface
	
	int a;
	
	public Mobile(){
		
	}
	
	public void call(){
		System.out.println("I know how to call");
	}
	
	 public abstract void roratingCamera();
	

}


class MobilChild extends Mobile{
	
	public void roratingCamera(){
		
	}
	
}
