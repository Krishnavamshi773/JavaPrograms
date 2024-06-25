package Inheritance;
public class Rectangle extends ShapeR {
    int length;
    int breadth;

   public Rectangle(String name, int length, int breadth) {
       super(name);
       this.length = length;
       this.breadth = breadth;
   }

   void area() {
       int area = length * breadth;
       System.out.println("Area: " + area);
   }

   public static void main(String[] args) {
       Rectangle rectangle = new Rectangle("Rectangle", 30, 40);
       rectangle.shapeInfo();
       rectangle.area();
   }
}