package Lab7.ClassWork;

public class Volvo {
   private static double price ; 
	public static void main(String[] args) {
		
			Vehicle v = new Vehicle ();
			v.Vehicle("CAR NAME IS BMW");
			v.display();
			v.StartEngine();
			v.StopEngine();
			Volvo(500000);
			
			
			
	}
	public static void Volvo( double y)
	{
		price =y;
		System.out.println("BMW CAR PRICE IS="+price);
	}

}
