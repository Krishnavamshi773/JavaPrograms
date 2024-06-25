//package collectios
package Collections;

import java.util.LinkedHashMap;

public class DemoLinkedHashMap {

	public static void main(String[] args) {
		
LinkedHashMap<String,Integer> countrycodes=new LinkedHashMap<String,Integer>();

countrycodes.put("India", +91);
countrycodes.put("Pakistan", +92);
countrycodes.put("USA", +01);
countrycodes.put("Russia", +07);
countrycodes.put("Austrailia", +61);
countrycodes.put("China", +86);

System.out.println(countrycodes);
System.out.println(countrycodes.hashCode());
System.out.println(countrycodes.size());
System.out.println(countrycodes.values());
System.out.println(countrycodes.keySet());

	}
}
