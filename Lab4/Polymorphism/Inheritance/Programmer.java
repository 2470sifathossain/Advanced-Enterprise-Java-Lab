package Lab4.Polymorphism.Inheritance;

public class Programmer extends Employee {
	
	private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }

    public void totalSalary(){
        System.out.println(getSalary()+bonus);
    }

}
