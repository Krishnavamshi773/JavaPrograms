package Loops;
import java.util.Scanner;
public class ForLoop {
	public static void main(String args[]) {
		int i,num;
		Scanner kv=new Scanner(System.in);
		System.out.println("Enter a number");
		num=kv.nextInt();
		for(i=1;i<=10;i++) {
			
			System.out.println(num+"*"+i+"="+i*num);
			
		}
	}

}
