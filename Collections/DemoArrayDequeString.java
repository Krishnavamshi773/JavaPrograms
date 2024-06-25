//package name
package Collections;
//importing arraydeque methods
import java.util.ArrayDeque;
//class method
public class DemoArrayDequeString {
//main method
	public static void main(String[] args) {
//creating object for array deque
		ArrayDeque <String> adq=new ArrayDeque <String>();
		//adding elements
		adq.add("Krishna");
		adq.add("Vamshi");
		adq.add("Akhil");
		//printing
		System.out.println(adq);
		
		//adding element to to  the array
		adq.addFirst("Srinivas");
		System.out.println(adq);
 
		//adding element last to the array
		adq.addLast("Gangamani");
		System.out.println(adq);
		
		//removes the elrement
        adq.peek();

        //removes last element
         adq.poll();	
         System.out.println(adq);
         adq.pollLast();
         adq.push("Srinivas");
 		System.out.println(adq);
        
	}

}
