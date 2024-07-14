//package declaration
package MultiThreading;

//class method extends thread
public class MultiThreadExample extends Thread {
	
	//variable declaration
	String threadName;
	
	//public method with args
	public MultiThreadExample(String threadName) {
		
		//using super to get all the  ethods of child class
		super(threadName);
		
		//thos keyword to finalize the variable
		this.threadName= threadName;
	}

	//using method run()
	public void run() {
		
		//console 
		System.out.println("Name:"+this.getName());
		System.out.println("Prioroty:"+this.getPriority());
		System.out.println("ID:"+this.getName());
		
		
		//try block it will throw an error
		try {
			this.sleep(2000);
			
			
//catch block it will catch when an exception is occured
    	}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("ID:"+this.getId());
	}

	//main method
	public static void main(String[] args) {
		//1.New Thread
		MultiThreadExample demo=new MultiThreadExample("demoThread");
		//2.Runnable thread
		demo.start();
		
		//creating object for class 
		MultiThreadExample demo1=new MultiThreadExample("demo1 Thread");
		
		//setting priority
		demo1.setPriority(8);
		//starting a thread
		demo1.start();
		
		//creating another object for a class
		MultiThreadExample demo2=new MultiThreadExample("demo2 Thread");
		
		//staring a thread
		demo2.start();
		
		//creating one more object for a class
		MultiThreadExample demo3=new MultiThreadExample("demo3 Thread");
		
		//starting a thread
		demo3.start();
	
		{

	}

	}	
	
}