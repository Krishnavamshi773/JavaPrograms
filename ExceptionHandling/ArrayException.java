package ExceptionHandling; // Package declaration

public class ArrayException { // Class declaration

    public static void main(String[] args) { // Main method declaration

        System.out.println("Start of the prgm"); // Print start message

        try {
            int arr[] = {1, 2, 3}; // Initialize an array with three elements
            System.out.println(arr[6]); // Attempt to access the 7th element (this will cause an ArrayIndexOutOfBoundsException)
        } catch (ArrayIndexOutOfBoundsException ae) { // Catch block to handle ArrayIndexOutOfBoundsException
            System.out.println("Array Exception caught"); // Print exception caught message
        } finally {
            System.out.println("End of the prgm"); // Print end message (this will always be executed)
        }
    }
}
