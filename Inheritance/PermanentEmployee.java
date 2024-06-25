package Inheritance;
public class PermanentEmployee extends Employee {   
	int leaves;
    int bonus;
    int pf;

    void permanentEmpInfo() { 
    	System.out.println("Permanent Employee Details: " + leaves + ", " + bonus + ", " + pf);
    }

    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee(); 
        emp.empId = 1122; 
        emp.empName = "Raj"; 
        emp.salary = 50000; 
        emp.leaves = 30; 
        emp.bonus = 5000;
        emp.pf = 3000; 
        emp.permanentEmpInfo(); }
}