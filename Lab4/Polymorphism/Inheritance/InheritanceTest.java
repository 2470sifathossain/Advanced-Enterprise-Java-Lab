package Lab4.Polymorphism.Inheritance;

public class InheritanceTest {

	
	    public static void main(String[] args) {
	        Employee employee = new Employee();

	        System.out.println(employee);

	        employee.setId(100);
	        employee.setName("Zaman");
	        System.out.println(employee);
	        employee.setSalary(5000);
	        System.out.println(employee);

	        Programmer programmer = new Programmer();
	        programmer.setId(200);
	        programmer.setName("Sifat Hossain");
	        programmer.setSalary(3000);
	        programmer.setBonus(300);
	        System.out.println(programmer);

	        programmer.totalSalary();
	        
	    }
	}
