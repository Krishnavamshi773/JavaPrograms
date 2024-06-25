//Package Collections
package Collections;

//Importing LinkedHAstset methods
import java.util.HashSet;

//class method
public class DemoHashSet{
	
	//main method
	public static void main(String[] args) {

		//creating object for linkedhashmap methods
		HashSet <String> names= new HashSet<String>();
		names.add("Java");
		names.add("C");
		names.add("C++");
		names.add("Python");
		names.add("AWS");
		System.out.println(names);
		
		for(String s:names)
			System.out.println(s);
         names.add("java");
         names.add(null);
         names.add(null);
 		System.out.println(names);

		
	}

}
