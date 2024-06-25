package JavaBasic;
import java.util.Scanner;
class Bank
{
  public static void main (String args[])
  {
    int accno,cred,withd,bal,op;
    Scanner k=new Scanner(System.in);
    System.out.println("enter you name:");
    String name=k.next();
    System.out.println("enter your account number:");
    accno=k.nextInt();
    //System.out.println("enter account type:");
    //String acctype=k.next();
    System.out.println("enter your amount:");
    bal=k.nextInt();

    System.out.println("coustmer name:"+name);
    System.out.println("Account number:"+accno);
    //System.out.println("account type:"+acctype);
    System.out.println("available balance:"+bal);
    
    System.out.println("Choose a option");
    System.out.println("1.Withdraw amount");
    System.out.println("2.Credit amount");
    System.out.println("enter your option");
    op=k.nextInt();
    
    if(op==1)
    {
     System.out.println("enter withdrawal amount:");
        withd=k.nextInt();
      if(withd>bal)
       {
        System.out.println("Insufficient funds");
        }
       else if(withd<=bal)
        {
        bal=bal-withd;
        System.out.println("Available balance: "+bal);
        }
       }
        else
        {
          System.out.println("enter credit amount: ");
          cred=k.nextInt();
          bal=bal+cred;
          System.out.println("Available balance:"+bal);
        }
}
}