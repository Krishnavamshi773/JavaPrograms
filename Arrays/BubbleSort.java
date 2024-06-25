package Arrays;
//class 
public class BubbleSort {
	    // Method to sort an array using Bubble sort
		public static void bubbleSort(int[] arr) {	       
			 // Get the length of an array
			int n = arr.length;	
			 // Outer loop for passes through the array
	        for (int i = 0; i < n-1; i++) {
	        	// Inner loop for each comparison
	            for (int j = 0; j < n-i-1; j++) {
	             	 // Compare adjacent elements
	                if (arr[j] > arr[j+1]) {
	                    // Swap arr[j] and arr[j+1] if order is wrong
	                    int temp = arr[j];                  
	                    //Assign the value of arr[j+1] to arr[j]
	                    arr[j] = arr[j+1];	                    
	                    // Assign the value of the temporary variable to arr[j+1]
	                    arr[j+1] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {  	
	    	// array with unsorted values
	        int[] arr = {64, 34, 25, 12, 22, 11, 90};
	        // Call the bubbleSort method to sort the array
	        bubbleSort(arr);
	        System.out.println("Sorted array:");
	              // Loop through each element in the sorted array
	        for (int num : arr) {  	
	        	 // Print each element with space
	            System.out.print(num + " ");
	       
	        }
	    }
	}
