package JavaBasic;

//Class with different access modifiers
class MyClass {

 public int publicVariable;
 private int privateVariable;
 protected int protectedVariable;
 int defaultVariable;

 // Constructor to initialize variables
 public MyClass(int publicVariable, int privateVariable, int protectedVariable, int defaultVariable) {
     this.publicVariable = publicVariable;
     this.privateVariable = privateVariable;
     this.protectedVariable = protectedVariable;
     this.defaultVariable = defaultVariable;
 }

 // Getter for privateVar
 public int getPrivateVariable() {
     return privateVariable;
 }

 // Setter for privateVar
 public void setPrivateVariable(int privateVariable) {
     this.privateVariable = privateVariable;
 }
}

//Another class accessing the variables
public class AccessSpecifiers {

 public static void main(String[] args) {

     // Creating an object of MyClass with initial values
     MyClass obj = new MyClass(100, 200, 300, 400);

     // Accessing public variable
     System.out.println("Public Variable: " + obj.publicVariable); 

     // Accessing private variable via getter
     System.out.println("Private Variable (via getter): " + obj.getPrivateVariable());

     // Accessing protected variable
     System.out.println("Protected Variable: " + obj.protectedVariable); 

     // Accessing default variable
     System.out.println("Default Variable: " + obj.defaultVariable); 

     // Modifying private variable via setter
     obj.setPrivateVariable(1000);
    
     // Accessing updated private variable
     System.out.println("Updated Private Variable (via getter): " + obj.getPrivateVariable()); 
 }
}