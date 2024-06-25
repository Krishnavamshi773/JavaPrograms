package Operators;

public class AssignmentOp {


    public static void main(String[] args) {
        
        int a, b;
        a = 50;
        b = 40;
        
        System.out.println("a=" + a + ", b=" + b);

        // Using addition assignment operator +=
        a += 20;
        System.out.println("After a += 20, a=" + a);

        // Using subtraction assignment operator -=
        b -= 10;
        System.out.println("After b -= 10, b=" + b);

        // Comparing values of a and b using == operator
        System.out.println("a == b is " + (a == b));

        // Using relational operators (<, >, <=, >=)
        System.out.println("a > b is " + (a > b));
        System.out.println("a < b is " + (a < b));
        System.out.println("a >= b is " + (a >= b));
        System.out.println("a <= b is " + (a <= b));

        // Using logical operators (&&, ||, !)
        boolean condition1 = (a > 50) && (b < 30);
        boolean condition2 = (a < 100) || (b > 20);
        boolean condition3 = !(a == b);

        System.out.println("(a > 50) && (b < 30) is " + condition1);
        System.out.println("(a < 100) || (b > 20) is " + condition2);
        System.out.println("!(a == b) is " + condition3);
    }
}