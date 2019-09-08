package Lab6.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IoTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("hello.txt");

        // Print Writer
        PrintWriter out = new PrintWriter(file);
        out.println("Sifat hossain");
        out.println(22);
        out.close();

        // read file data

        Scanner input = new Scanner(file);
        String name = input.nextLine();
        int age = input.nextInt();

        System.out.println("Name : " + name + "\nAge : " + age);

        // read keyboard input

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name1 = scanner.nextLine();

        System.out.println("Enter your age : ");
        int age1 = scanner.nextInt();

        System.out.println("Name : " + name1 + "\nAge : " + age1);
    }
}
