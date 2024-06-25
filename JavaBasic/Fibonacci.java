package JavaBasic;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int i,n1=0,n2=1,n3,range;
		
		Scanner k =new Scanner(System.in);
		System.out.println("Enter range");
		range=k.nextInt();
		System.out.print(n1+" "+n2);
		i=3;
		while (i<=range){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			i++;
		
			System.out.print(" "+n3);

		}
	}
}
