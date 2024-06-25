package Operators;
import java.util.Scanner;
public class ArithmaticRelationalOp {

	public static void main(String[] args) {
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a value");
		a=s.nextInt();
		System.out.println("Enter b value");
		b=s.nextInt();
		//Arithmatic operators
	System.out.println("a+b="+(a+b));
	System.out.println("a-b="+(a-b));
	System.out.println("a*b="+(a*b));
	System.out.println("a/b="+(a/b));
	
	//Relational operator
	System.out.println("a>b="+(a>b));
    System.out.println("a<b="+(a<b));
    System.out.println("a==b="+(a==b));
    System.out.println("a!=b="+(a!=b));
    System.out.println("a>=b="+(a>=b));
    System.out.println("a<=b="+(a<=b));

	}
}