package Interface;

public class Circle implements Shapes {

	public Circle(int r) {
		super();
	int radius=r;	
	}

	@Override
	public int area() {
		System.out.println("Circle is created");
		return 0;
	}

	@Override
	public int perimeter() {
		int radius = 0;
		System.out.println("Radius : "+radius*radius);	
		return 0;
	}

	public static void main(String[] args) {
		//System.out.println("Circle is created");
Circle s=new Circle(6);
s.area();
s.perimeter();
	}

}
