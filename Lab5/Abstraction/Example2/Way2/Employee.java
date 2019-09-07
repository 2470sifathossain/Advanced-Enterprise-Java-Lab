package Lab5.Abstraction.Example2.Way2;

public abstract class Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public abstract double calculateSalary();
}
