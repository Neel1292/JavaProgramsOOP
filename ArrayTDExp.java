import java.util.*;
import java.io.*;

//Two Dimensonal Array using user input
public class ArrayTDExp {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Row : ");
        int row =sc.nextInt();
        System.out.print("Enter Size of Column : ");
        int col = sc.nextInt();
        int matrix[][] = new int[row][col];

        System.out.println("Enter Data in Matrix : ");
        for(int i = 0;i<row;i++)
        {
            for(int j =0;j<row;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
    

     System.out.println("Data in Matrix : ");
        for(int i = 0;i<row;i++)
        {
            for(int j =0;j<row;j++)
            {
               System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
 
    }
}
