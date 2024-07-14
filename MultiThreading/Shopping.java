package MultiThreading;
//Class Declaration
public class Shopping {
	//Variable Declaration
	String product;
	//Method for product delivery
	synchronized void delivered(String pro) throws InterruptedException {
		this.product=pro;
		//checking if product delivered or not
		if(product.compareToIgnoreCase("deliverd")!=0)
			//if not delivered wait until notified
			wait();
		//if delivered print payment successfully and product delivered
		System.out.println("The product delivered,payment done successfully.");
	}
	//method for product not delivered
	synchronized void notdelivered(String pro) {
		System.out.println("The product not delivered yet.....");
		this.product=pro;
		//using notify()
		notify();
	}
}
