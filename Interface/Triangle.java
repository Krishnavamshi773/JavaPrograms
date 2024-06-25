package Interface;

public class Triangle implements Shapes {

	public Triangle() {

	}

	@Override
	public int area() {

		return 0;
	}

	@Override
	public int perimeter() {

		return 0;
	}

	public static void main(String[] args) {

	}

	@Override
	public int surfacearea() {
		return Shapes.super.surfacearea();
	}

}
