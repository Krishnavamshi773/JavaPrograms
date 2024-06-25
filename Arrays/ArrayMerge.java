package Arrays;

public class ArrayMerge {
    public static void main(String[] args) {
      
    	int[] a1 = {7, 10, 18, 33, 45};
        int[] a2 = {30, 57, 76, 99};
        
        int[] a3 = new int[a1.length + a2.length];

        // Copy elements from a1 to a3 starting at index 0
        System.arraycopy(a1, 0, a3, 0, a1.length);
        
        
        // Copy elements from a2 to a3 starting at 
        //the index after the last element of a1
        System.arraycopy(a2, 0, a3, a1.length, a2.length);

        
        // Loop through the merged array arr3 and print each element
        for (int num : a3) {
        	
            System.out.print(num + " ");
      
        }
    }
}