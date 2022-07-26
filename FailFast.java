import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class FailFast {
        public static void main(String args[]) {
        
        try
        {
            TreeSet<String> ts = new TreeSet<>();

            ts.add("C");
            ts.add("C++");
            ts.add("Java");

            Iterator tsIterator = ts.iterator();

            ts.add("Php");

            while(tsIterator.hasNext())
            {
                System.out.println(tsIterator.next());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    
    }
}


// Output:

// PS C:\Users\Neel Prajapati\OneDrive\Desktop\Java Task> cd "c:\Users\Neel Prajapati\OneDrive\Desktop\Java Task\" ; if ($?) { javac FailFast.java } ; if ($?) { java FailFast }
// java.util.ConcurrentModificationException
