package Strings;
//class method
public class StringReverse {
//main method
	public static void main(String[] args) {
		//string declaration
  String str ="KRISHNA";
  //printing thr string on console
  System.out.println(str);
  //defining reverse string
  String revstr="";
  //using for loop to check the string and to print reverse string 
  for (int i=str.length()-1;i>=0;i--) {
	  //reverse string 
	  revstr+=str.charAt(i);
	  }
  //printing reverse string
	  System.out.println("Reversed String is "+revstr);
	}

}
