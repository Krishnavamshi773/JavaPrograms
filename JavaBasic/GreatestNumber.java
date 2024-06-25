package JavaBasic;

import java.util.Scanner;

public class GreatestNumber {

 // Method to find the greatest number among two numbers
   
	public int findGreatest(int num1, int num2) {
       
		return (num1 > num2) ? num1 : num2;
    }

   
	
	public static void main(String[] args) {
       
    	
    	// Creating an instance of the class
        
         GreatestNumber greatestNumber = new GreatestNumber();
        
    	
    	int num1, num2;

        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number:");
        num2 = sc.nextInt();

       
        
        
        // Calling the method using the instance
     
        
       
        int greatest = greatestNumber.findGreatest(num1, num2);

        System.out.println("The greatest number is: " + greatest);
    }
}
