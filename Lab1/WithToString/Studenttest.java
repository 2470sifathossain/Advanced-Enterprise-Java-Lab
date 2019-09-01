package Lab1.WithToString;
import Lab1.Student;
public class Studenttest {

	public static void main(String[] args) {
		int id; 
        String name;
        double cgpa; 

        id = 153402342; 
        name = "Md Sifat Hossain";
        cgpa = 3.06; 

        
        Student student = new Student();

        student.setId(id); 
        student.setName(name);
        student.setCgpa(cgpa); 

        System.out.println("this prints student's information using \"toString\" method");
        System.out.println("---------------------------------------");

        
        System.out.println(student);
    }
}
