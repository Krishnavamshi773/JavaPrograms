package JavaBasic;

public class AccessModExample 

 {
    public int publicVariable; // Public variable accessible from anywhere
    private int privateVariable; // Private variable accessible only within this class
    protected int protectedVariable; // Protected variable accessible within this class and its subclasses
    int defaultVariable; // Default variable accessible only within the same package

    // Constructor to initialize variables
    public AccessModExample() {
        publicVariable = 1;
        privateVariable = 2;
        protectedVariable = 3;
        defaultVariable = 4;
    }

    // Method to access and modify private variable
    public void setPrivateVariable(int value) {
        privateVariable = value;
    }

    // Method to display all variables
    public void displayVariables() {
        System.out.println("Public Variable: " + publicVariable);
        System.out.println("Private Variable: " + privateVariable);
        System.out.println("Protected Variable: " + protectedVariable);
        System.out.println("Default Variable: " + defaultVariable);
    }

    // Main method to test the access specifiers
    public static void main(String[] args) {
        AccessModExample obj = new AccessModExample();

        // Accessing public variable
        System.out.println("Accessing public variable: " + obj.publicVariable);

        // Accessing private variable indirectly through a method
        obj.setPrivateVariable(5);
        System.out.println("Accessing private variable indirectly through method: " + obj.privateVariable);

        // Accessing protected variable (no subclass in this example)
        System.out.println("Accessing protected variable: " + obj.protectedVariable);

        // Accessing default variable
        System.out.println("Accessing default variable: " + obj.defaultVariable);
    }
}

