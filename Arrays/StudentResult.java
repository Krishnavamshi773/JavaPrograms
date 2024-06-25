package Arrays;
import java.util.Scanner;

public class StudentResult {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // To enter the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Creating an array to store the marks
        int[] marks = new int[numSubjects];

        //  Entering marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double percentage;
        int sum = 0;
        boolean passed = true;

        // Checking if the student has passed or failed
        for (int mark : marks) {
            if (mark <= 35) {
                passed = false;
                break;
            }
        }

        if (passed) {
            // Calculating the total marks
            for (int mark : marks) {
                sum += mark;
            }

            // Calculating the percentage
            percentage = (double) sum / numSubjects;
            System.out.println("Student result passed = " + sum + "\nPercentage = " + percentage);
        } else {
            System.out.println("Student failed");
        }

        }
}
