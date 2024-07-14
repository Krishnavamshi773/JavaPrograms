package MultiThreading;

class Customer {
	    int amount = 10000;

	    synchronized void withdraw(int amount) {
	        System.out.println("Going to withdraw...");
	        if (this.amount < amount) {
	            System.out.println("Less balance; waiting for deposit..."+amount);
	            try {
	                wait(); // Pauses the current thread
	            } catch (Exception e) {
	                // Handle exceptions
	            }
	        }
	        this.amount -= amount;
	        System.out.println("Withdraw completed..."+amount);
	    }

	    synchronized void deposit(int amount) {
	        System.out.println("Going to deposit..."+amount);
	        this.amount += amount;
	        System.out.println("Deposit completed. Notifying waiting threads..."+amount);
	        notify(); // Wakes up a waiting thread
	    }
	
	    public static void main(String[] args) {
	        Customer customer = new Customer();

	        // Create two threads
	        Thread withdrawThread = new Thread(() -> customer.withdraw(5000));
	        Thread depositThread = new Thread(() -> customer.deposit(3000));

	        withdrawThread.start();
	        depositThread.start();
	    }
	}


