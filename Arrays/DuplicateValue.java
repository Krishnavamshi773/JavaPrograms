package Arrays;
//classname
public class DuplicateValue {
//main function
	public static void main(String[] args) {
		//declaring array and assigning values
int arr[]= {69,7,10,18,30,33,45,18,45,99,69};
//initialising variales
int count=0;
//for loop to check the duplicate values
for( int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		//condition
		if(arr[i]==arr[j]) {
			//printing duplicate values
			System.out.println(arr[j]);
			count++;
		}
	}
}
//printing count number
System.out.println("count is = "+count);
	}
}
