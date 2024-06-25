package Interface;

public class Cube extends Square implements Shapes, ThreeDShape {

	
	public Cube(int side) {
		super(side);
	}
	
	@Override
	public double volume() {
		
		return 0;
	}

	@Override
	public int area() {
		return 0;
	}

	@Override
	public int perimeter() {
		return 0;
	}

}
