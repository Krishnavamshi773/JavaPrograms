package Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		//initializing an array 
		int arr[] = {109,80,76,420,69,};
		
		//initializing minimum and maximum variables 
		 int min =arr[0];
		 int max= arr[0];
		 
		  //loop though the array
		 for(int i=0;i<arr.length;i++){
			 
		 //if the cuurent element is smaller than min,update min
		 if(min >arr[i]) {
		         min =arr[i];
		         
		 }
		 
		 
		 //if the cuurent element is larger than max,update min
		if(max<arr[i]) {
				max =arr[i];
		}
		 }
		 
		 // print the minimum and maximum values
		 System.out.println("Minimum is  "+min);
		 System.out.println("Maximum is  "+max);
					 
	}

}