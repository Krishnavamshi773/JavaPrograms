package ExceptionHandling;

import java.util.Scanner;

public class StudentEnrollApp {
	void enroll(int income, String status) {
		if(income>500000)
			throw new ArithmeticException();
		else if(status.equalsIgnoreCase("no"))
			throw new NullPointerException();
		System.out.println("Student Enrolled into the Batch");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudentEnrollApp s=new StudentEnrollApp();
		System.out.println("Enter Annual Income:");
		int income=sc.nextInt();
		System.out.println("Is your Degree completed?:yes/no:");
		String status=sc.next();
		try {
		s.enroll(income, status);
		}catch(Exception e) {
			System.out.println("You are not eligible for the Enrollment.");
		}
	}
}