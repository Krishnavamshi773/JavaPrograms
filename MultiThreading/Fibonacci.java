package MultiThreading;
public class Fibonacci {
    private int[] arr;

    public Fibonacci(int[] arr) {
        this.arr = arr;
    }

    synchronized void fibonacciSeries() {
        int n = arr.length;
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // Calculate Fibonacci value
        }

        for (int i = 0; i < n; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Fibonacci[" + i + "] = " + fib[i]);
        }
    }
}
