package MultiThreading;

public class TrafficSignals {

    public static void main(String[] args) {
        Signals sig = new Signals();

        Thread t1 = new Thread() {
            public void run() {
                try {
					sig.green("red");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
        };

        t1.start();

        Thread t2 = new Thread() {
            public void run() {
            	sig.red("green");
            }
        };
        t2.start();
    }

}