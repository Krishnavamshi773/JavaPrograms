package Arrays;

import java.util.Scanner;

public class StudentArray {
public static void main(String args[]) {
	int []marks= {43,54,37,76,66};
double percentage;
int i=0,sum=0;
boolean b=true;
for(;i<marks.length;) {
	if(marks[i]<=35)
		b=false;
	i++;
}

if(b) {
	for(i=0;i<marks.length;i++) {
		sum+=marks[i];
	}
	
	percentage=sum/6;
	System.out.println("student result passed = "+sum+"\n  percentage = "+percentage);
	
}
else
	System.out.println("Student failed");

}}