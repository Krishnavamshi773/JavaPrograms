package MultiThreading;

class OnlineShopping {
	//Main Method
	public static void main(String[] args) {
		//object for Shopping class
		Shopping sh=new Shopping();
		//Thread object
		Thread th=new Thread() {
			//Running Thread1
			public void run() {
				try {
				sh.delivered("not delivered");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}}
		};
		//Thread start()
		th.start();
		//Thread object
		Thread th1=new Thread() {
			//running Thread2
			public void run() {
				sh.notdelivered("delivered");
			}
		};
		//Thread Start1()
		th1.start();
	}
}