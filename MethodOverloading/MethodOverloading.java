package MethodOverloading;

public class MethodOverloading {
void sum() {
	System.out.println("Welcome to Method Overloading");
}
void sum(int x,int y) {
	System.out.println("The sum of two integers are="+(x+y));
}

void sum(int x,double y) {
	System.out.println("The sum of int and double are="+(x+y));
}
void sum(int x,int y,int z) {
	System.out.println("The sum of three integers are="+(x+y+z));
}

double avg(int a,int b) {

	double avg=a+b/2;
	System.out.println("Average of  two numbers are="+avg);
	return avg;
}

double avg(int a,int b, int c) {
	double avg=a+b+c/3;
	System.out.println("Average of  three numbers are="+avg);
	return avg;
}

public static void main(String args[]){
MethodOverloading m=new	MethodOverloading();
m.sum();
m.sum(10,20);
m.sum(23, 6.86);
m.sum(8,90, 54);
m.avg(23, 37);
m.avg(4, 4, 6);
}
}

