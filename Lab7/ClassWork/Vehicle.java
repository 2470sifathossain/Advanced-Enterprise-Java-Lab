package Lab7.ClassWork;

public class Vehicle implements Drive {
	protected String model;
	
	public void Vehicle( String model)
	{
		this.model=model;
	}
	
	public void display(){
		System.out.println(model);
	}

	@Override
	public void StartEngine() {
		System.out.println("My Bmw Car Start Engine");
		
	}

	@Override
	public void StopEngine() {
		System.out.println("My Bmw Car Stop Engine");
		
	}

	
}
