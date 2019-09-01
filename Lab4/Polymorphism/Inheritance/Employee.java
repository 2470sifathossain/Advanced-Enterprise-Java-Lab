package Lab4.Polymorphism.Inheritance;

public class Employee {
	 private long id;
	    private String name;
	    private double salary;

	    public long getId() {
	        return id;
	    }

	    public void setId(long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", name='" + name + '\'' +
	                ", salary=" + salary +
	                '}';
	    }

	    public void totalSalary(){
	        System.out.println(this.salary);
	    }
	}
