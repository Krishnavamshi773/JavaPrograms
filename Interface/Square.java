package Interface;

public class Square implements Shapes {
	
	int side;
	
	//Constructor with parameter side
	public Square(int side) {
		//super();
		this.side = side;
	}

	@Override
	public int area() {
	  int area=side*side;
	  return area;	
	}

	@Override
	public int perimeter() {
		int perimeter=4*side;
		return perimeter;
		
	}
	
	public int surfacearea() {
		return 1;
	}

	public static void main(String[] args) {
       Square square=new Square(25);
       int a=square.area();
       System.out.println("Area="+a);
       System.out.println("Perimeter="+square.perimeter());
       System.out.println("Surface Area="+square.surfacearea());
       Shapes.msg();
       
  
	}

	

}