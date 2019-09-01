package Lab1.WithOnlyObject;

public class Studenttest {

	public static void main(String[] args) {
		int id; 
        String name; 
        double cgpa; 

        id = 153402342; 
        name = "Md Sifat Hossain"; 
        cgpa = 3.06; 

        
        Student student = new Student(id, name, cgpa);

        System.out.println("this prints student's information using only object");
        System.out.println("---------------------------------------");
        System.out.println("My name is: " + student.name);
        System.out.println("My ID is: " + student.id);
        System.out.println("and my CGPA is: " + student.cgpa);
    }
}


	


