import java.util.Scanner;
import java.io.*;

public class StudentResult
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Total Student : ");
        int size = sc.nextInt();

        int srollno[] = new int[size];
        String sname[] = new String[size];
        
        int scimarks[] = new int[size];
        int mathmarks[] = new int[size];
        int engmarks[] = new int[size];
        int ssmarks[] = new int[size];
        int hmarks[] = new int[size];
        int total[] = new int[size];
        double per[] = new double[size];
       
        
        System.out.println("\nEnter Data into Student Record : ");

        for(int i = 0;i<size;i++)
        {
            
                srollno[i] = sc.nextInt();
                sname[i] = sc.next();
                scimarks[i] = sc.nextInt();
                mathmarks[i] = sc.nextInt();
                engmarks[i] = sc.nextInt();
                ssmarks[i] = sc.nextInt();
                hmarks[i] = sc.nextInt();
                total[i] = scimarks[i] + mathmarks[i] + engmarks[i] + ssmarks[i] + hmarks[i];
                per[i] = total[i] / 5;

        }

        

        System.out.println("Rollno\tName\tScience Marks\tMaths Marks\tEnglish Marks\tS.S Marks\tHindi Marks\tTotal\tPercentage\n");
        
        for(int i = 0;i<size;i++)
        {
            System.out.print(srollno[i]+".          "+sname[i]  +"           "+ scimarks[i] +"             "+ mathmarks[i] +"              "+ engmarks[i] +"             "+ ssmarks[i] +"           "+  hmarks[i] +"           "+ total[i] +"           "+ per[i]);

            System.out.println();
        }
    }
}
            