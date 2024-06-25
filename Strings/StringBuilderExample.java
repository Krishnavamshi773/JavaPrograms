package Strings;

//class method
public class StringBuilderExample {

	//main method
	public static void main(String[] args) {

		//StringBuilder creation using new kwyword
		StringBuilder str = new StringBuilder("Hello World");
		
		//Ptrinting the string
		System.out.println(str);
		
		//length() returns the length of a string
		System.out.println(str.length());
		
		//charAt() returns the index element
		System.out.println(str.charAt(7));
		
		//capacity() returns the current capacity of a string
		System.out.println(str.capacity());
		
		//lastIndexof() it retuns the last index value of a element
		System.out.println(str.lastIndexOf("o"));
		
		//indexof()  it returns the index numbr of an element 
		System.out.println(str.indexOf("e"));
		
		//toString() it returns the existing string 
		String s=str.toString();
		System.out.println(s);
		
		//StringBuffer str1=new StringBuffer(str);
		//System.out.println(str1);
	}

}
