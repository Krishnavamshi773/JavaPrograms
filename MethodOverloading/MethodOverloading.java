//package method overloading (package declaration)
package MethodOverloading;

//class method(Classname method overloading)
public class MethodOverloading{
void sum() {  	//method declaration(method with no returntype,and no arguments)

	//output for method1
	System.out.println("Welcome to Method Overloading");
}
	
void sum(int x,int y) { //method declaration(method with  arguments,using datatypes)
	System.out.println("The sum of two integers are="+(x+y));
}

void sum(int x,double y) {  //method declaration(method with arguments,using different datatypes)
	System.out.println("The sum of int and double are="+(x+y));
}
void sum(int x,int y,int z) {  //method declaration(method with  arguments  using same data types)
	System.out.println("The sum of three integers are="+(x+y+z));
}

double avg(int a,int b) {  //method declaration(method with returntype,and  arguments)

	double avg=a+b/2;
	System.out.println("Average of  two numbers are="+avg);
	return avg;
}

double avg(int a,int b, int c) {  //method declaration(method with  returntype,and arguments  3 datatypes)
	double avg=a+b+c/3;
	System.out.println("Average of  three numbers are="+avg);
	return avg;
}

	//main method
public static void main(String args[]){

	//object creation
MethodOverloading m=new	MethodOverloading();

	//calling methods
m.sum();
m.sum(10,20);
m.sum(23, 6.86);
m.sum(8,90, 54);
m.avg(23, 37);
m.avg(4, 4, 6);
}
}

