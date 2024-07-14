package MultiThreading;

public class SynchronizedDemo extends Thread {
ArrayElements ae;
	
	public SynchronizedDemo(int[] arre, ArrayElements ae) {
   super();
   this.ae=ae;
	}

	public void run() {
		ae.sumOfElements();
	}
	
	public static void main(String[] args) {
   
	int[] arr = {1, 2, 3, 4, 5, 6};
	
	ArrayElements arre= new ArrayElements(arr);

	SynchronizedDemo sd = new SynchronizedDemo(arr,arre);
	sd.start();

	SynchronizedDemo sd1 = new SynchronizedDemo(arr,arre);
	sd1.start();

	SynchronizedDemo sd2 = new SynchronizedDemo(arr,arre);
	sd2.start();

	}
}
