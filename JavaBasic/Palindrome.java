package JavaBasic;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
    	Palindrome();
    
    }
    public static void Palindrome() 	
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int input = scanner.nextInt();
              int temp = input, rem, rev = 0;     
        while (input > 0) { 	
            rem = input % 10;   
            rev = rev * 10 + rem;
               input /= 10;
        }
        if (rev == temp) {
            System.out.println("The number is a palindrome.");
        } 
        else {
            System.out.println("The number is not a palindrome.");
        }
    }
}