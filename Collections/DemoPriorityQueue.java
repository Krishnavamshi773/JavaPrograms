//package collections
package Collections;
//imorting priority queue methods
import java.util.PriorityQueue;
//class methods
public class DemoPriorityQueue {
	//main method
    public static void main(String[] args) {
        
    	//creating object for priorityqueue
    	PriorityQueue<Integer> pq = new PriorityQueue<>();
    	
    	//adding elements to the qeue
        pq.add(10);
        pq.add(45);
        pq.add(99);
        pq.add(69);
        pq.add(33);
        pq.add(18);
        pq.add(7);
        
        //printing
        System.out.println(pq);
        
        //removing the first element
        System.out.println( "Removes Smallest element " +pq.poll());
        
        //printing the queue
        System.out.println("Elements in the queue: " + pq);
      
        //size of a queue
        System.out.println("Size of the Queue : " + pq.size());
        
        //retuns first element
        System.out.println("It Returns the first value : "+pq.peek());
        
    }
}
