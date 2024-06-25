package Collections;
import java.util.HashMap;
public class DemoHashMap {

	public static void main(String[] args) {
HashMap<Integer,String> hm=new HashMap<Integer,String>();
hm.put(1, "Indore");
hm.put(2, "Surat");
hm.put(3, "Mumbai");
hm.put(4, "Ambikapur");
hm.put(5, "Vizag");

System.out.println(hm);
System.out.println(hm.entrySet());
System.out.println(hm.keySet());
System.out.println(hm.values());
System.out.println(hm.containsKey(4));
System.out.println(hm.containsValue("Mumbai"));
//System.out.println(hm.remove());
System.out.println(hm.replace(4, "Banglore"));
System.out.println(hm.replace(5, "Vizag", "Chennai"));
System.out.println(hm);

	
	}

}