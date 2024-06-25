package Strings;

public class Employee {
    int empid;
    String name;

    public Employee(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empid + ", Name: " + name;
    }

    public static void main(String[] args) {
        // Create an array of Employee objects
        Employee[] employees = new Employee[3];

        // Initialize each employee object
        employees[0] = new Employee(69, "Vamshi");
        employees[1] = new Employee(7, "Krishna");
        employees[2] = new Employee(6, "Akhil");

        // Print employee details
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
