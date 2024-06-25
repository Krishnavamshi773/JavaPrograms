package JavaBasic;
import java.util.Scanner;

public class Student {
    int rollNo;
    String name;
   // String qualification;
    int marks;

    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter roll no: ");
        student.rollNo = scanner.nextInt();

        System.out.println("Enter name: ");
        student.name = scanner.next();

       // System.out.println("Enter Qualification: ");
       // student.qualification = scanner.next();

        System.out.println("Enter marks: ");
        student.marks = scanner.nextInt();

        System.out.println("Student Details: ");
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Name: " + student.name);
        //System.out.println("Qualification: " + student.qualification);
        System.out.println("Marks: " + student.marks);
    }
}