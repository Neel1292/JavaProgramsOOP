import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPrint {
        public static void main(String args[]) {
            
            Set<String> progLanguages = new HashSet<>();

            progLanguages.add("C");
            progLanguages.add("C++");
            progLanguages.add("Java");
            progLanguages.add("JavaScript");
            progLanguages.add("React.js");
            progLanguages.add("Nord.js");

           Iterator<String> progLanguagesss = progLanguages.iterator();


            System.out.println("\n---------Iterate using Java 8 using forEachRemaining Loop--------");
            progLanguagesss.forEachRemaining(progLanguagess->{
                System.out.println(progLanguages);
            });

            System.out.println("\n-------Iterating using Java For Each Loop-------\n");
            progLanguages.forEach(progLAnguage->{
                System.out.println(progLanguages);
            });
    }
}