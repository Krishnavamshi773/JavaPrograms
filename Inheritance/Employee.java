package Inheritance;

public class Employee {

    int empId;
    String empName;
    int salary;

    // default Constructor
    Employee() {
        System.out.println("Employee Object Created");
    }
    //parameterized Construcor
    Employee(int id,String n,int s){
    	 empId=id;
         empName=n;
         salary=s;
	
    }
void empInfo() {
	System.out.println("Employee Details:"+empId+ "\n Name:"+empName+ "\n Salary"+salary);
}
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.empId = 1232;
        emp.empName = "Ram";
        emp.salary = 50000;
        emp.empInfo();
        Employee emp1=new Employee(123,"vamshi",5000);
        		emp1.empInfo();
    }
}