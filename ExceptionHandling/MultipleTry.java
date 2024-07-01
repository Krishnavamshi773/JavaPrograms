package ExceptionHandling;

import java.util.TreeSet;

public class MultipleTry {

    int arr[] = {1, 2, 3, 4};

    public static void main(String[] args) {
        MultipleTry mt = new MultipleTry();
        mt.run();
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array Exception Caught");
        }

        try {
            TreeSet<Integer> test = new TreeSet<Integer>();
            test.add(null);
        } catch (NullPointerException ne) {
            System.out.println("Null Pointer Exception Caught");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("End of program");
        }
    }
}
