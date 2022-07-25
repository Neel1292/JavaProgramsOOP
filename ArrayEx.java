import java.util.*;
import java.io.*;

public class ArrayEx {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size :");
        int size = sc.nextInt();

        int data[] = new int[size];

        System.out.println("Enter Data into Array");
        for(int i = 0;i<size;i++)
        {
            data[i] = sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println("Data : "+data[i]);
        }
    }
}