import java.io.*;
import java.util.Collection;
import java.util.Set;
import java.util.*;


public class MoviBooking {
    
    static int cid = 1001;

    public static void main(String args[]) {  
        


        Map<Integer,String> book = new HashMap<>();
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String s = sc.next();
        
        Scanner c = new Scanner(System.in);
        System.out.print("\nEnetr Seat No : ");
        int seat = c.nextInt();

        book(seat);
        book.put(cid,s); 
        System.out.println("\nCustomer Id : "+book.keySet()+ " Coustumer Name : "+book.values()); 

          
    }

    static int book(int seat) {

        int[] no = new int[5];
            
        for(int i = 0;i<=seat;i++) {
                
            if(seat == no[i]) {
        
                    System.out.println("Sorry Seat is Already Booked.....");
                    
            }
                
            else {
                
                no[i]= seat;
                System.out.println("Congratulations Ticket Booked Successfuly");
                cid += 1;
                

            }
                
        } 
        
        return cid;
        
    }
}