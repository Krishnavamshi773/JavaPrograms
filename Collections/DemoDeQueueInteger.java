//package collections
package Collections;

//importing Arraydeque methods
import java.util.ArrayDeque;

//class method
public class DemoDeQueueInteger {

	//main method
	public static void main(String[] args) {
		
		//creating object for array deque
    ArrayDeque<Integer> adq= new ArrayDeque<Integer>();
    //adding elements
    adq.add(60);
    adq.add(7);
    adq.add(10);
    adq.add(18);
    //printing
    System.out.println(adq);
    System.out.println(adq.peek());
    System.out.println(adq);
    System.out.println(adq.poll());
    System.out.println(adq);
    adq.addFirst(77);
    System.out.println(adq);
    adq.addLast(99);
    System.out.println(adq);
    adq.remove();
    System.out.println(adq);
    adq.removeFirst();
    System.out.println(adq);
    adq.removeLast();
    System.out.println(adq);
		}

}
