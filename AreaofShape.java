import java.io.*;
import java.util.*;


class Area
{
    int rec(int l,int b)
    {
        System.out.println("\nCalculating Area of Rectangle....");
        return l*b;
    }

    double circle(double r)
    {
        System.out.println("\nCalculating Area of Circle....");
        return 3.14 * r * r;
    }

    int sqr(int s)
    {
        System.out.println("\nCalculating Area of Square....");
        return s * s;
    }
}

public class AreaofShape
{
    public static void main(String args[])
    {
        Area ar = new Area();

        System.out.println(ar.rec(2,3));

        System.out.println(ar.circle(3));

        System.out.println(ar.sqr(4));
    }
}