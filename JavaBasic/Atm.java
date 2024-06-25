package JavaBasic;
import java.util.Scanner;
public class Atm {
	public static void main(String args[]) {
		int amount,sumamount=0,balance=120000;
		Scanner s=new Scanner(System.in);
		while(balance>0) {
			System.out.println("Enter amount to withdraw");
			amount=s.nextInt();
	
	sumamount+=amount;
	if(sumamount>50000) {
		
	System.out.println("limit exceeded");
	
		break;
	}
	balance-=amount;
	System.out.println("Account balance = "+balance+ "  Amount withdrawn = "+sumamount);
	
		}
	}

}
