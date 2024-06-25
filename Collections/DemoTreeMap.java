package Collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {

TreeMap<Integer,String> tmap= new TreeMap<Integer,String>();
tmap.put(11, "Developer");
tmap.put(2, "Tester");
tmap.put(13, "Tech Support");
tmap.put(41, "Data Analyst");
tmap.put(10, "Data Base Administrator");
tmap.put(5, "system Architect");
tmap.put(0, null);

System.out.println(tmap);

TreeMap<Double,Integer> tm= new TreeMap<Double,Integer>();
 tm.put(32.09,100);
 tm.put(45.69, 50);
 tm.ceilingEntry((double) 67);
 tm.floorKey((double) 7);
 System.out.println(tm);

	}

}
