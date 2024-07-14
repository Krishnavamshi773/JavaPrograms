
package MultiThreading;

public class Synchronizedfibonacci extends Thread {
Fibonacci f;
	
	Synchronizedfibonacci(int[] arre, Fibonacci f) {
   super();
   this.f=f;
	}

	public void run() {
		f.fibonacciSeries();
	}
	
	public static void main(String[] args) {
   
	int[] arr = {1, 2, 3, 4, 5, 6,7,8,9};
	
	Fibonacci arre= new Fibonacci(arr);

	Synchronizedfibonacci sd = new Synchronizedfibonacci(arr,arre);
	sd.start();

	Synchronizedfibonacci sd1 = new Synchronizedfibonacci(arr,arre);
	sd1.start();

	Synchronizedfibonacci sd2 = new Synchronizedfibonacci(arr,arre);
	sd2.start();

	}
}
