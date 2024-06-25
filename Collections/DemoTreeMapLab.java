//package collections
package Collections;

//imorting the class of treemap
import java.util.TreeMap;

//class method
public class DemoTreeMapLab {

	//main method
	public static void main(String[] args) {

		//creating the object for treemap class
TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();

//adding values
tmap.put(6, "Krishna vamshi");
tmap.put(7, "Nagaraju");
tmap.put(16, "Sai krishna");
tmap.put(26, "Dhanush");
tmap.put(38, "Rajesh");
tmap.put(135, "Anvesh");

//adding null value it accept
tmap.put(0, null);

//printing
System.out.println(tmap);

 	//it returns true if the key is contains otherwise it retuns false
System.out.println(tmap.containsKey(6));

//it returns true if the value is contains otherwise it retuns false

System.out.println(tmap.containsValue("Rajesh"));

// it returns the value with respect to key
System.out.println(tmap.get(7));

//System.out.println(tmap.putFirst(2, "Vijay"));
//System.out.println(tmap.putLast(142, "Firoz"));

//it removes the value with respect to the key
System.out.println(tmap.remove(135));

//output
System.out.println(tmap);

// it returns the size of a set
System.out.println(tmap.size());

//it retruns first key
System.out.println(tmap.firstKey());

//it retuns last key
System.out.println(tmap.lastKey());

	}

}
