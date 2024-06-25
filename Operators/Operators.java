package Operators;
public class Operators{
	public static void main(String args[]) {
		//arithmatic and reational operators
		int a,b;
		a=50;
		b=40;
		
	System.out.println("a="+a+",b="+b);
	a+=20;
	System.out.println("a="+a);
	System.out.println("b="+(b-=10));
	System.out.println("a==b is "+(a>b));
	//ternary operator
	int big=a>b?a:b;
	System.out.println("Big="+big);
	}

}