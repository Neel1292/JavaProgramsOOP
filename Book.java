import java.io.*;
import java.util.*;

public class Book
{
    String btitle;
    int bid;
    String bpub[] = {"Technical Publication","Gurudev Publication Pvt. Ltd.","Young Mind Prints","ISRO Publication Ltd."};

    void booksearch()
    {
        String type[] = {"Technical Book","Mythology Book","Novel","Sci-Fi Book"};

        if(bid == 1001 || bid == 1002 || bid == 1003 || bid == 1004 || bid == 1005 || bid == 1006 || bid == 1007 || bid == 1008 || bid == 1009 || bid == 1010 )
        {
            System.out.println("Book Type : "+type[0]);
            System.out.println("Publication : "+bpub[0]);

        }
        else if (bid  == 1011 || bid == 1012 || bid == 1013 || bid == 1014 || bid == 1015 || bid == 1016 || bid == 1017 || bid == 1018 || bid == 1019|| bid == 1020)
        {
            System.out.println("Book Type : "+type[1]);
            System.out.println("Publication : "+bpub[1]);

        }
        else if(bid == 1021 || bid == 1022 || bid == 1023 || bid == 1024 || bid == 1025 || bid == 1026 || bid == 1027 || bid == 1028 || bid == 1029 || bid == 1030)
        {
            System.out.println("Book Type : "+type[2]);
            System.out.println("Publication : "+bpub[2]);

        }
        else
        {
            System.out.println("Book Type : "+type[3]);
            System.out.println("Publication : "+bpub[3]);

        }
    }

    public static void main(String args[])
    {
        Book b = new Book();
        b.btitle = "Java Programing";
        b.bid = 1009;
        
        System.out.println();
        
        System.out.println("Book Title :"+b.btitle);
        System.out.println("Book ID : "+b.bid);
        b.booksearch();
        System.out.println();


    }
        
}