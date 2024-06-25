//package collections
package Collections;

//importing class hash map
import java.util.HashMap;

//class method
public class DemoHashMapLab {

	//main method
	public static void main(String[] args) {

		//creating object for  the hashmap
		HashMap <String,Integer> hm=new HashMap <String,Integer>();
		
		//adding keys and values to the hashmap object
		hm.put("India", +91);
		hm.put("Pakistan", +92);
		hm.put("USA", +01);
		hm.put("Russia", +07);
		hm.put("Austrailia", +61);
		hm.put("China", +86);

		//printing
        System.out.println(hm);
		
        //it returns the entire set wit keys and values
        System.out.println(hm.entrySet());
       
        //it returns the key set
		System.out.println(hm.keySet());
		
		//it returns values set
		System.out.println(hm.values());
		
		//it returns true if the key is contains otherwise it retuns false
		System.out.println(hm.containsKey("Pakistan"));
		
     	//it returns true if the value is contains otherwise it retuns false
		System.out.println(hm.containsValue(+86));
		
		//it removes the key and value in a set
		System.out.println(hm.remove("Pakistan", +92));
		
		//final output
		System.out.println(hm);


	}

}
