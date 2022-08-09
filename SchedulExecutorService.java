import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulExecutorService {
        public static void main(String args[]) {
        System.out.println("Creating Schedule Executor Service....");

        ScheduledExecutorService execute = Executors.newScheduledThreadPool(2);

        Runnable task = ()->{
            System.out.println("Executed task at "+System.nanoTime());
        };
    
        System.out.println("Submitting task at "+System.nanoTime() + " to be exectued after 5 seconds");
        execute.schedule(task,2,TimeUnit.SECONDS);

        Runnable task1 = ()->{
            System.out.println("Executed task at "+System.nanoTime());
        };
       
        System.out.println("Submitting 2nd  at "+System.nanoTime() + " to be exectued after 5 seconds");
        execute.schedule(task1,2,TimeUnit.SECONDS);

        execute.shutdown();
        
    }
}

// OUTPUT :

// Creating Schedule Executor Service....
// Submitting task at 1103285262646999 to be exectued after 5 seconds
// Submitting 2nd  at 1103285275105299 to be exectued after 5 seconds
// Executed task at 1103287289981799
// Executed task at 1103287289972500
