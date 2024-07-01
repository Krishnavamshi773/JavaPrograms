package ExceptionHandling;

//Demonstrating throw and throws
public class DemoThrow {
	void divide(int a,int b) throws ArithmeticException
	{
		if(b==0)
			throw new ArithmeticException();
		int c=a/b;
		System.out.println("a/b:"+c);
	}
	char charStr(String s,int a) throws StringIndexOutOfBoundsException{
		if(a>=s.length())
			throw new StringIndexOutOfBoundsException();
		return s.charAt(a);
		
	}
	public static void main(String[] args) {
		DemoThrow demo=new DemoThrow();
		try {
		demo.divide(10,10);
		char ch=demo.charStr("Anudip",4);
		System.out.println(ch);
	}
		catch(ArithmeticException ae) {
			System.out.println(ae);
		}
		catch(StringIndexOutOfBoundsException s) {
			System.out.println(s);
		}
   }
}
