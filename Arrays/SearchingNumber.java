package Arrays;
// class declaration
public class SearchingNumber {
	//main function
    public static void main(String[] args) {
    	//array implementation
        int arr[]={69,7,18,33,45,10,30};
        //assigning values
        int num=45; 
//checking boolean
        boolean found=false; 
//for loop to check number is there or not
        for (int i=0; i<arr.length; i++) {
        	//condition for checking
            if (num==arr[i]) {
                found=true;
                //to break the if found
                break; 
           }
        }

        if (found) {
//print if found
        	System.out.println("Element found");
        } 
        
        else {
//print if not found
        	System.out.println("Element not found");
        }
    }
}
