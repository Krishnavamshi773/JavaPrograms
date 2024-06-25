package Collections;

import java.util.Stack;

public class DemoStack{
	public static void main(String[] args) {
Stack<Integer> stack=new Stack<Integer>();
stack.push(2);
stack.add(20);
stack.push(30);
stack.push(50);

System.out.println(stack);
System.out.println(stack.peek());
System.out.println(stack.pop());
System.out.println(stack.peek());
System.out.println(stack.search(10));

	}

}
