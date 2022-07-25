import java.io.*;
import java.util.*;

class DemoAccount
{

    int acno = 1234567;
    String aname = "Mr. Neel Prajapati";
    double amount;
    double balance = 0;

    void detail()
    {
        System.out.println("Account Number : "+acno);
        System.out.println("Customer Name : "+aname);
    }
    Scanner sc = new Scanner(System.in);

    public double deposite()
    {
       
        System.out.print("Enter the Amount you want to Deposite : Rs ");
        amount = sc.nextInt();
        balance = balance + amount;
        System.out.println();
        System.out.println("The account is credited with Rs "+amount);
        System.out.println("Balance : Rs "+balance);
        return balance;
    }

    public double withdraw()
    {
         System.out.print("\nEnter the Amount you want to Withdraw  : ");
        amount = sc.nextInt();
        balance = balance - amount;

        if(balance < 500)
        {
            System.out.println("Transaction Failed ! Due to Insufficient Balance ");
            balance = balance + amount;
            System.out.println("Minimum Amount  Rs 500.00 in Bank Account After Withdraw ");
        }
        else
        {
           
            System.out.println("Transaction Completed Successfully");
        }

        System.out.println("Balance : "+balance);
        return balance;
    }

}

public class Account 
{
    public static void main(String args[])
    {
        DemoAccount acc = new DemoAccount();

        System.out.println(); 

        acc.detail();

        while(true)
        {   
            System.out.println("\n1. Deposite\n2. Withdraw\n3. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter your Choice : ");
            
            
                int sel = sc.nextInt();  

                switch(sel)
                {
                    case 1:
                    acc.deposite();
                    break;

                    case 2:
                    acc.withdraw();
                    break;
                    
                    case 3:
                    return;
                    
                    default:
                    System.out.println("Sorry Selected Action Cannot be Performed ");
                }
        }

    }
}