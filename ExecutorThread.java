import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// single thread
public class ExecutorThread {
        public static void main(String args[]) {
          System.out.println("Inside: "+Thread.currentThread().getName());

          System.out.println("Creating Executor....");
          ExecutorService executorService = Executors.newSingleThreadExecutor();

          System.out.println("Creating Runnanble....");
          Runnable runnable = ()->{
                System.out.println("Inside : "+ Thread.currentThread().getName());
          };

          System.out.println("Submitting the Task specified by the Runnable to Executor Service");
          executorService.submit(runnable);
          executorService.shutdown();
    }
}