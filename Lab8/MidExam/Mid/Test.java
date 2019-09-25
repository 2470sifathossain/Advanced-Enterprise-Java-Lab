package Mid;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		Manager m = new Manager();
		
		System.out.println("Enter name : ");
		m.name = s.nextLine();
		
		System.out.println("Enter age : ");
		m.age = s.nextInt();
		
		System.out.println("Enter weight : ");
		m.weight = s.nextDouble();
		
		s.nextLine();
		System.out.println("Enter address : ");
		m.address = s.nextLine();
		
		System.out.println(m.dispaly());
		
		
		
		Employee e = new Employee();
		
		System.out.println("Enter name : ");
		e.name = s.nextLine();
		
		System.out.println("Enter age : ");
		e.age = s.nextInt();
		
		System.out.println("Enter weight : ");
		e.weight = s.nextDouble();
		
		s.nextLine();
		System.out.println("Enter address : ");
		e.address = s.nextLine();
		
		System.out.println(e.dispaly());
		
		
		Student st = new Student();
		
		System.out.println("Enter name : ");
		st.name = s.nextLine();
		
		System.out.println("Enter age : ");
		st.age = s.nextInt();
		
		System.out.println("Enter weight : ");
		st.weight = s.nextDouble();
		
		s.nextLine();
		System.out.println("Enter address : ");
		st.address = s.nextLine();
		
		System.out.println(st.dispaly());
	}

}
