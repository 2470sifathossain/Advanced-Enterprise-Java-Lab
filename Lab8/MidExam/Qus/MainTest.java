package Qus;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bicycle bicycle = new Bicycle(); 
		bicycle.currentGear(2); 
		bicycle.speedUp(3); 
		bicycle.applyBrakes(1); 
		
		System.out.println("Bicycle present state :"); 
		bicycle.printStates(); 
		
		// creating instance of bike. 
		Motorbike bike = new Motorbike(); 
		bike.currentGear(1); 
		bike.speedUp(4); 
		bike.applyBrakes(3); 
		
		System.out.println("Bike present state :"); 
		bike.printStates();

	}

	}


