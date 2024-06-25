package Strings;
// enum 
enum Department{
Accounts,
Devops,
Testing,
HR
}
//class enum
public class Enum {
	//main method
public static void main(String[] args) {
	//object creation of testing class
	Department d=Department.Testing;
	//object creation of account class
	Department d1=Department.Accounts;
System.out.println(d);
System.out.println(d.compareTo(d1));
System.out.println(d.equals(d1));


}
}