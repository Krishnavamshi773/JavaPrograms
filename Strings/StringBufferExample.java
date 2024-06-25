package Strings;

//class method
public class StringBufferExample {
	
	//main method
    public static void main(String[] args) {
    	
    	//String using new keyword
        StringBuffer str = new StringBuffer("Anudhip");
        
        //adding the string to the existing string
        str.append(" Foundation");
        
        //printing string after append method
        System.out.println(str);
        
        //Reverse() to print the reverse of a string
        System.out.println(str.reverse());
       
       // charAt() to print
        System.out.println(str.charAt(4));
        
        //Indexof() to print the index element of a string
        System.out.println(str.indexOf("c"));
        
        //capacity() to print the current capacity of a string
        System.out.println(str.capacity());
        
        //Using another String with new keyword
        StringBuffer s=new StringBuffer("Advance program on java FullStack usig Angular");
       
        str.deleteCharAt(8);
        System.out.println(s);
        System.out.println(s.codePointAt(0));
        System.out.println(s.compareTo(str));
        
        
    }
}
