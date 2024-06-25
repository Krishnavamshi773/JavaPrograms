//package Collectin
package Collections;

//Importing Metods of Linkedhashset
import java.util.LinkedHashSet;

//class method
public class DemoLinkedHashSet {

	//main method
	public static void main(String[] args) {
   
		//creating object for Linkedhashset 
		LinkedHashSet <String> lhs= new LinkedHashSet <String>();

		//adding elements to LinkedHAshSet
		lhs.add("Krishna");
		lhs.add("Vamshi");
		lhs.add("Rajesh");
		lhs.add("Nagaraj");
		lhs.add("Arun");
		 
		//printing the elements
		System.out.println(lhs);
		
		//adding duplicate value
		//it does not take duplicate values
		lhs.add("Arun");
		
		//adding null value
		//it takes null value
		lhs.add(null);
 
		//adding the element to the first
		lhs.addFirst("Firoz rafi");
		
		//adding the element to the last
		lhs.addLast("Dhanush");
		
		System.out.println(lhs);

		//Removes first element
		lhs.removeFirst();
		
		//removes last element
		lhs.removeLast();
		
		System.out.println(lhs);
		
	}

}
