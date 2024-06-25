package Interface;

public interface ThreeDShape {
double volume();
 default void msg() {
	 System.out.println("Default method");
	 
 }
 static void call() {
	 System.out.println("staticmethod");
 
 }
}
