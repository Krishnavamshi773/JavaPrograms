package Inheritance;


abstract public class ShapeR {

    String name;

    public ShapeR(String name) {
    	super();
        this.name = name;
    }

    void shapeInfo() {
        System.out.println("Name of Shape = " + name);
    }

    abstract void area();
}