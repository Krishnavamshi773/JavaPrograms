package Collections;
//importing arraylist package
import java.util.ArrayList;
import java.util.List;
// class method as arraylistdemo
public class DemoArrayList {
	//main method
    public static void main(String[] args) {
    	//arraylist creation
        ArrayList<Object> list = new ArrayList<>();
 
        //adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add('a');
        list.add(3.14);
        list.add("java");

        //printing thr list
        System.out.println(list);

        //adding more elements to the list
        list.add(1, 2);
        System.out.println(list);

        list.set(2, 4);
        System.out.println(list);
 
        //creting list objects
        List<Object> arrlist = new ArrayList<>(list); // Use constructor to copy elements

        //arrlist
        System.out.println(arrlist);

        //printimg arraylist methods
        System.out.println("Index of 20: " + list.indexOf(20));
        System.out.println("Contains 1: " + list.contains(1));
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));
        System.out.println("Size of list: " + list.size());

        // Removing elements
        list.remove(Integer.valueOf(9)); // Remove by value
        list.remove(2); // Remove by index
        list.remove("java"); // Remove by value

        System.out.println(list);
    }
}
