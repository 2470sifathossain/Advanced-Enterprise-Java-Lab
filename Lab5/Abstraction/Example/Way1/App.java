package Lab5.Abstraction.Example.Way1;

public class App {

	public static void main(String[] args) {
		MyTest mytest = new Add();
		MyTest mytest1 = new Sub();
		MyTest mytest2 = new Mul();
		
		System.out.println("ADD" + mytest.calculate(2, 3));
		System.out.println("SUB" + mytest1.calculate(2, 3));
		System.out.println("MUL" + mytest2.calculate(2, 3));
		
		
		
		

	}

}
