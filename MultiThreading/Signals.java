package MultiThreading;

public class Signals {
	
	String signal;
	 //String s;
	
	synchronized void green(String signal) throws InterruptedException {
		this.signal=signal;
		if(signal.compareToIgnoreCase("green")!=0)
	wait();
		
		System.out.println("The Siganl is Green : Now you can Go  " +this.signal);
	}
	
  synchronized  void red(String s) {
    	
		System.out.println("The Siganl is Red: Wait for 1 minute  " +this.signal);

		this.signal= s;

		notify();
    }
    /*void orange(String signal) {
    	
    }*/
  

}
