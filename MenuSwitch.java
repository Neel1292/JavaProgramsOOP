import java.io.*;
import java.util.*;

class Addition 
{
    Scanner sc = new Scanner(System.in);

    int a,b;

    
    void operation()
    {
        System.out.print("\nEnter A : ");
        a = sc.nextInt();

        System.out.print("\nEnter B : ");
        b = sc.nextInt();

        int ans = a + b;
        System.out.print("\nAnswer : "+ ans);
    }
}

class Subtraction 
{
    int a,b; 

    Scanner sc = new Scanner(System.in);

    void operation()
    {
         System.out.print("\nEnter A : ");
        a = sc.nextInt();

        System.out.print("\nEnter B : ");
        b = sc.nextInt();

        int ans = a - b;
        System.out.print("\nAnswer : "+ ans);
    }
}

class Multiplication
{
    int a,b;

    Scanner sc = new Scanner(System.in);


    void operation()
    {
        System.out.print("\nEnter A : ");
        a = sc.nextInt();

       System.out.print("\nEnter B : ");
        b = sc.nextInt();

        int ans = a * b;
         System.out.print("\nAnswer : "+ ans);
    }
}

class  Divison
{
    int a,b; 

    Scanner sc = new Scanner(System.in);

    void operation()
    {
         System.out.print("\nEnter A : ");
        a = sc.nextInt();

        System.out.print("\nEnter B : ");
        b = sc.nextInt();

        double ans = a / b;
         System.out.print("\nAnswer : "+ ans);
    }
}

class Modulo
{
    int a,b;

    Scanner sc = new Scanner(System.in);

    void operation()
    {
         System.out.print("\nEnter A : ");
        a = sc.nextInt();

        System.out.print("\nEnter B : ");
        b = sc.nextInt();

        double ans = a % b;
         System.out.print("\nAnswer : "+ ans);
    }
}

public class MenuSwitch
{
    public static void main(String[] args)
    {
        Scanner ns = new Scanner(System.in);

        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Divison d = new Divison();
        Modulo md = new Modulo();

        System.out.println("\nMenu for Mathematical Operation");

        System.out.println("\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Divison \n5.Modulo");

        System.out.print("\nEnter Your Choise : ");
        int  choice = ns.nextInt();

        switch(choice)
        {
            case 1:
            a.operation();
            break;

            case 2:
            s.operation();
            break;

            case 3:
            m.operation();
            break;

            case 4:
            d.operation();
            break;

            case 5:
            md.operation();
            break;

            default:
            System.out.println("Sorry! You have entered wrong choice.");
             
        }
    }
}