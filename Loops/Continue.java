package Loops;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		int range,sum=0;
	System.out.println("Enter range");
	Scanner s=new Scanner(System.in);
	range=s.nextInt();
	for(int i=0;i<=range;i++) {
		if(i%2==0)
			continue;
		sum+=i;
		System.out.println(i);
	}

	}

}
