//package declaration
package MultiThreading;

//class method implements runnable interface
class DThread implements Runnable{

	//overriding amethod run()
	@Override
	public void run() {
		
		//printimg an output
		System.out.println	("Thread name:"+Thread.currentThread());
		System.out.println	(Thread.currentThread().getPriority());

		}
}

//using method runnable thread
public class RunnableThread {

	//main method
	public static void main(String[] args) {

		//output
		System.out.println	(Thread.currentThread().getPriority());

		//creating an object  for class
		DThread dt=new DThread();
		
		//creating a object for thread
		Thread t=new Thread(dt,"Demo one");
		
		//staring a thread
		t.start();
	}

}
