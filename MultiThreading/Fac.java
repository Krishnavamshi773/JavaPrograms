//package declaration
package MultiThreading;

//class method
class Factorial {
	
    // Static synchronized method to calculate factorial
    public static synchronized long calculateFactorial(int n) {
      
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
// Define a custom Thread class to calculate factorial of a number
class FactorialThread extends Thread {
    int number;

    // Constructor to initialize the number for which factorial needs to be calculated
    public FactorialThread(int number) {
        this.number = number;
    }

    // Override the run method to perform factorial calculation
    @Override
    public void run() {
        
        long result = Factorial.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is " + result);
    }
}

// Main class to demonstrate thread 
public class Fac {
	
	//main method
    public static void main(String[] args) {
        
    	//creating object for a class
        FactorialThread thread1 = new FactorialThread(5); // Thread to calculate factorial of 5
        FactorialThread thread2 = new FactorialThread(7); //  7
        FactorialThread thread3 = new FactorialThread(8); //  10

        // Start the threads
        thread1.start(); // Start thread to calculate factorial of 5
        thread2.start(); //  7
        thread3.start(); //  10
    }
}