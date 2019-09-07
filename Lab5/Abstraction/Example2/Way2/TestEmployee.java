package Lab5.Abstraction.Example2.Way2;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e = new Contractor();
		e.setSalary(1000);
		System.out.println("Con" + e.calculateSalary() );
		
		
		Employee e1 = new FullTime();
		e1.setSalary(2000);
		System.out.println("FullTime" + e1.calculateSalary() );
		
		
		

	}

}
