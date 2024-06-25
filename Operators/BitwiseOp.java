package Operators;

public class BitwiseOp {
	public static void main(String[] args) {
		

		int x=0b1011;
		int y=0b1110;
		
		System.out.println("x&y="+ (x&y));
		System.out.println("x|y="+ (x|y));
		System.out.println("x^y="+ (x^y));
		System.out.println("~x="+ (~x));

		System.out.println("x<<1"+ (x<<1));
		System.out.println("y>>2"+ (y>>2));
			

	
	}
}
