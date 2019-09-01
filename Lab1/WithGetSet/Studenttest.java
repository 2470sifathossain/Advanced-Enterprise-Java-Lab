package Lab1.WithGetSet;

import Lab1.Student;


public class Studenttest {
    public static void main(String[] args) {

        int id; 
        String name; 
        double cgpa; 

        id = 153402342;
        name = "Md Sifat hossain"; 
        cgpa = 3.06; 

       
        Student student = new Student();

        student.setId(id); 
        student.setName(name); 
        student.setCgpa(cgpa); 

        System.out.println("this prints student's information using set and get methods");
        System.out.println("---------------------------------------");


        System.out.println("My name is: " + student.getName());

      
        System.out.println("My ID number is: " + student.getId());

  
        System.out.println("and my CGPA is: " + student.getCgpa());
    }
}
