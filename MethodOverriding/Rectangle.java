package MethodOverriding;

class Rectangle extends Shape{
	
	int l,b;
	int a=l*b;
	  
	 @Override
	void area() {
		System.out.println("Area of Rectangle="+a);
	}


public static void main(String args[])
{
Rectangle s=new Rectangle();
s.area();
	
}	
}