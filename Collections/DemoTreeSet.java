//package collections
package Collections;

//Imorting TreeSet methods
import java.util.TreeSet;

//class  method
public class DemoTreeSet {

	//maion method
	public static void main(String[] args) {
		
		//creating object for TreeSet
		TreeSet<String> ts=new TreeSet<String>();
		
		//adding elements to the treeset
		ts.add("India");
		ts.add("Austrailia");
		ts.add("England");
		ts.add("Pakistan");
		
		//printing
		System.out.println(ts);
		
	//  ts.add(null);
	  ts.add("India");
		//System.out.println(ts);	  
		//unsupported
		//ts.addFirst("Kolkata");
		//ts.addLast("Delhi");
	  
	  //gets the first elements
		System.out.println(ts.first());
		
		//returs the treeset in reverse order
		System.out.println(ts.reversed());
		
		//gets the size of a tree set
		System.out.println(ts.size());
		
		  //gets the first elements
		System.out.println(ts.getFirst());
				
		//gets the last element in treeset
		System.out.println(ts.getLast());

		//gets the first inserteed  element in treeset 	
		System.out.println(ts.higher("England"));

	}

}
