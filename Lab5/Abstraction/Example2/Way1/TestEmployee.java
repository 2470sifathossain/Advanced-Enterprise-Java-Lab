package Lab5.Abstraction.Example2.Way1;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Contractor();
		Employee e2 = new FullTimeEmployee();
		
		System.out.println("CONTRACTOR"+ e1.calculateSalary());
		System.out.println("FullTime"+ e2.calculateSalary());
		
		

	}

}
