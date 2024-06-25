package MethodOverloading;

public class MethodOverloadingLab {
	//Intro
	void area() {
		System.out.println("Welcome to MethodOverloading");
	}
	
	//Square area
	int area(int a) {
		int area=a*a;
		System.out.println("The area of Sqaure="+area);
	return area;
	}
	
	//Recatngle area
	int area(int l,int b) {
	int	area=l*b;
	System.out.println("The area of Rectangle="+area);
	return area;
	}
	//Triangle area
	 double area(int h,double b) {
	double	area = h*b/2;
	System.out.println("The area of Triangle="+area);
	return area;
	}


	public static void main(String[] args) {
		MethodOverloadingLab m=new MethodOverloadingLab();
		m.area();
		m.area(6);
		m.area(4,7);
		m.area(5,8.0);
	}

}
