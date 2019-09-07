package Lab5.Abstraction.Example.way2;

public class App {

	public static void main(String[] args) {
		MyTest m = new Add();
		m.setFirstNumber(3);
		m.setSecondNumber(2);
		
		
		MyTest m1 = new Sub();
		m1.setFirstNumber(3);
		m1.setSecondNumber(2);
		
		
		MyTest m2 = new Mul();
		m2.setFirstNumber(3);
		m2.setSecondNumber(2);
		
		
		System.out.println("Add" + m.calculate() );
		System.out.println("SUB" + m1.calculate());
		System.out.println("Mul" +m2.calculate());

	}

}
