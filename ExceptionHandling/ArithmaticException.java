package ExceptionHandling; // Package declaration

public class ArithmaticException { // Class declaration

    public static void main(String[] args) { // Main method declaration

        int a, b, c; // Declare three integer variables
        a = 20; // Initialize variable 'a' with value 20
        b = 0; // Initialize variable 'b' with value 0

        System.out.println("Start of the prgm"); // Print start message

        try {
            c = a / b; // Attempt to divide 'a' by 'b' (this will cause an ArithmeticException)
            System.out.println(c); // Print the result (this line will not be executed if an exception occurs)
            System.out.println("End of the prgm"); // Print end message (this line will not be executed if an exception occurs)
        } catch (ArithmeticException ae) { // Catch block to handle ArithmeticException
            System.out.println("Arithmetic Exception caught"); // Print exception caught message
        } finally {
            System.out.println("End of the prgm"); // Print end message (this will always be executed)
        }
    }
}
