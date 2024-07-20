package Contructors;

public class ParameterConstructor {

	ParameterConstructor(int x,float y) {
		int a=10;
		int b=20;
		int c=5;
		System.out.println(a*b+c);
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		ParameterConstructor pc=new ParameterConstructor(7,8);
	}

}
