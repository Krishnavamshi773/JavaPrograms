package Inheritance;

public class ContractEmployee extends Employee {
int contractperiod;
int privillageleaves;
int workingdays;

void contractEmpInfo()
{
System.out.println("Conyract Employee Details:"+contractperiod+", "+privillageleaves+","+workingdays);


}
public static void main(String args[]) {
	ContractEmployee emp=new ContractEmployee();
	emp.empId=2134;
}
}
