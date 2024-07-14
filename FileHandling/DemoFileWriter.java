package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DemoFileWriter {

	public static void main(String[] args) throws IOException {
     FileWriter fw=new FileWriter("Demo.txt");
      fw.write("Hello java world Welcome to oops");
      fw.close();
      
      File f=new File("Demo.txt");
      
      Scanner s= new Scanner(f);
      
      if(s.hasNext()) {
    	  String str=s.nextLine();
    	  System.out.println(str);
      }
      
}

}
