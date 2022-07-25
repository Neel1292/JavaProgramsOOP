import java.io.*;
import java.util.*;

class AtmPin
{
    int cardno;
    private static int pin;
    int sel;
    int pinno,cpin;

    Scanner sc = new Scanner(System.in);

    public void setpin(int pin)
    {
        this.pin = pin;
        System.out.println("\nATM Pin Set Sucessfully....");
    }

    public int getpin()
    {
        System.out.println("\nATM PIN :  "+pin);
        return pin;
    } 


    void reset()
    {
        System.out.println("Confirm '1' Yes or '0' No");
        sel = sc.nextInt();

        if(sel == 1)
        {
            System.out.println("Enter New Pin : ");
            pinno = sc.nextInt();

            System.out.println("Enter New Pin Again : ");
            cpin = sc.nextInt();

            if(pinno == cpin)
            {
                pin = pinno;
                pinno = 0;
                cpin = 0;
                System.out.println("Pin Changed Successfully....");
            }
            else
            {
                System.out.println("Pin Doesn't Match Try Again....");
            }
           
        }
        else{
            System.out.println("You have denied....");
        }


    }

    
}

public class AtmCard
{
    public static void main(String args[])
    {
        AtmPin atm = new AtmPin();

        while(true)
        {
            System.out.println("\n1. Set Pin\n2. Get Pin\n3. Reset Pin\n4. Exit\n");
            Scanner c = new Scanner(System.in);
            System.out.print("Select Option : ");

            int choice = c.nextInt();

            switch(choice)
            {
                case 1:
                atm.setpin(1234);
                break;

                case 2:
                atm.getpin();
                break;

                case 3:
                atm.reset();
                break;
                
                case 4:
                return;

                default:
                System.out.println("Wrong Choice ");       
            }

        }
    }
}