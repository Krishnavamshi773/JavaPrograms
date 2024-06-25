package MethodOverriding;
public class PermanentEmployee extends ContractEmployee{

	@Override //Methodoverriding
	void Details() {
		super.Details();
	System.out.println("ContractEmployee Details");	
	}

	@Override //Methodoverriding
	void totalsalary() {
		super.totalsalary();
		System.out.println("ContractEmplyee salary is = 100k");	
	}
	

public static void main(String args[]) {
	PermanentEmployee p=new PermanentEmployee();
	p.Details();
	p.totalsalary();
}
}
