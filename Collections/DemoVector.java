package Collections;

import java.util.Vector;

public class DemoVector {

	public static void main(String args[]) {
	Vector<String> vector = new Vector<String>();
	
	vector.add("Apple");
	vector.add("Mango");
	vector.add("Banana");
	

   System.out.println(vector);
   
   System.out.println(vector.firstElement());
   System.out.println(vector.lastElement());
   
	vector.add("Grapes");
	vector.add("orange");
	vector.add(null);
	vector.add(5,"strawberry");

	   System.out.println(vector);

	   System.out.println(vector.capacity());
	   System.out.println(vector.get(4));
	   System.out.println(vector.getLast());
	   System.out.println(vector.addAll(vector));
	   System.out.println(vector.equals(vector));


	   
	}
}
