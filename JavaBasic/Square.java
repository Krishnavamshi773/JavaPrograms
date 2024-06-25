package JavaBasic;


public class Square {
    double side;

    // Constructor to initialize the side of the square
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    public double area() {
        return side * side;
    }

    // Method to calculate the perimeter of the square
    public double perimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        // Creating an object of Square class with side length 5
        Square square = new Square(5);

        // Calculating and printing the area of the square
        System.out.println("Area of the square: " + square.area());

        // Calculating and printing the perimeter of the square
        System.out.println("Perimeter of the square: " + square.perimeter());
    }
}