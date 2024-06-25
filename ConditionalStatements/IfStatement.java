package ConditionalStatements;

import java.util.Scanner;

public class IfStatement {

	static void checkNum(int n)
	{
		 if (n % 2 == 0)
	            System.out.println("The number " + n + " is even.");
	        else
	            System.out.println("The number " + n + " is odd.");		
	}
	
	public static void main(String[] args) {
       
		int num;
        System.out.println("Enter A Number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        checkNum(num);
       
    }
}
