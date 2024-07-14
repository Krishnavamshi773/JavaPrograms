package MultiThreading;

public class ArrayElements {
    private int[] arr;

    public ArrayElements(int[] arr) {
        this.arr = arr;
    }

    synchronized void sumOfElements() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Accumulate the sum of elements
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(arr[i]);
        }
        
        System.out.println("Sum of elements: " + sum);
    }
}
