package Loops;
//program to calculate sum of numbers based on given range

import java.util.*;
public class WhileLoop {
	public void sumN(int n) {
		int i=1,sum=0;
		while(i<=n) {
			sum+=i;
		i++;
		}
		System.out.println("sum of "+n+" numbers = "+sum);
	}
	

	public static void main(String[] args) {
		
	WhileLoop demo=new WhileLoop();
	System.out.println("Enter a number");
	Scanner k=new Scanner(System.in);
	int num=k.nextInt();
	demo.sumN(num);
		
	}

}
