package Arrays;
// class declaration
public class SortingAscending {
//main function
	public static void main(String[] args) {
		//array initilisation and delcaration
        int arr[]={69,7,18,33,45,10,30};
        //initailizing local variables
        int i,j,temp;
        //using for loop to check the total numbers
    for(i=0;i<arr.length-1;i++) {
    	for(j=0;j<arr.length-1;j++) {
    		// if condition
    		if(arr[j]>arr[j+1]) {
    			//using temprary variable to store the lowest number
    			 temp=arr[j];
    			 //swappimg numbr
    			arr[j]=arr[j+1];
    			//storing in acsending order
    			arr[j+1]=temp;	
    		}
    	}
    }
    //using for loop to print all the values in ascending rder
    for(i=0;i<arr.length;i++) {
    // prnting in ascending order
    	System.out.println(+arr[i]);
    }
	}

}
