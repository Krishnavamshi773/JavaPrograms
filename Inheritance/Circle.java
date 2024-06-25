package Inheritance;
//to inherit the properties of parent class
public class Circle extends ShapeC { 

	//variable declaration	
	int radius;
	
	//child class method (Constructor with parameters)
	public Circle(int r){ 
		
		//asssigning radius as a variable r
		radius=r; 
		
		//print output stream to display the output on console
	System.out.println(" circle is created");
	}

	//no args constructor
	 public void Area() {	
		 
		//print output stream to display the output on console 
		 System.out.println("Radius : "+radius*radius);	
		 }
	 

	//Main method
	 public static void main(String[] args)	 {
		 
		//object creation for child class
	  Circle cir =new Circle(5);
	  
	  cir.draw();//initialisation of parent class
	  cir.Area();//initialisation of child class
	 }
}