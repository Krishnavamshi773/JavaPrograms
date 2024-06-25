package JavaBasic;


public class AccessMod {
    public int num1;
    private int num2;
    protected int num3;
    int num4;

    public AccessMod() {
        this.num1 = 1;
        this.num2 = 2;
        this.num3 = 3;
        this.num4 = 4;
    }

    public void printValues() {
        System.out.println("num1: " + this.num1);
        System.out.println("num2: " + this.num2);
        System.out.println("num3: " + this.num3);
        System.out.println("num4: " + this.num4);
    }

    public static void main(String[] args) {
    	AccessMod am = new AccessMod();
        am.printValues();
    }
}