package Arrays;
//class declaration
public class SortingDescending {
	//main function
	public static void main(String[] args) {
		//array initialisation and delaration
        int arr[]={69,7,18,33,45,10,30};
        int i,j,temp;
    for(i=0;i<arr.length-1;i++) {
    	for(j=0;j<arr.length-1;j++) {
    		if(arr[j]<arr[j+1]) {
    			 temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;	
    		}
    	}
    }
    for(i=0;i<arr.length;i++) {
    System.out.println(+arr[i]);
    }
	}


}
