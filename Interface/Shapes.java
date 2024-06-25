package Interface;

public interface Shapes {
	double pi=3.14;
int area();
int perimeter();
default int surfacearea() {
	System.out.println("Default method");

	return 0;
	
}
static void msg() {
	System.out.println("Static method");
}

}
