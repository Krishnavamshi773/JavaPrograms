package MethodOverriding;

public class ContractEmployee extends Employee{

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
	
}
