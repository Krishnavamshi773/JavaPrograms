package JavaBasic;



public class Box {
    int length, breadth;
    static int a;

    void measurements() {
        System.out.println("Measurements of a Box: " + length + ", " + breadth);  
    
    }

    static void msg() {
        System.out.println("Static block: " + a);
    }

    public static void main(String[] args) {
        Box b = new Box();
        b.length = 20; 
        b.breadth = 10; 
        b.measurements();

        a = 100;
        Box.msg(); 

        Box b1 = new Box();
        b1.length = 200;
        b1.breadth = 50;
        b1.measurements();
    }
}