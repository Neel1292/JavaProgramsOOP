import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
 
public class MultiExecutorThread {
        public static void main(String args[]) {
          System.out.println("Inside :" + Thread.currentThread().getName());

          System.out.println(("Creating Executor Service......"));
          ExecutorService execute = Executors.newFixedThreadPool(2);

          System.out.println("Cretaing Runnable for Multithreading....");

          Runnable task1 = ()->{
            System.out.println("Executing Task 1 : "+ Thread.currentThread().getName());
                try{
                        TimeUnit.SECONDS.sleep(2);
                }
                catch(InterruptedException e)
                {
                    throw new IllegalStateException(e);
                }
                        
          };

          Runnable task2 = ()->{
            System.out.println("Executing Task 2 : "+ Thread.currentThread().getName());
                 try{
                        TimeUnit.SECONDS.sleep(2);
                }
                catch(InterruptedException e)
                {
                    throw new IllegalStateException(e);
                }
          };
          
          Runnable task3 = ()->{
            System.out.println("Executing Task 3 : "+ Thread.currentThread().getName());
                try{
                        TimeUnit.SECONDS.sleep(2);
                }
                catch(InterruptedException e)
                {
                    throw new IllegalStateException(e);
                }
          };

          System.out.println("Submitting Tasks.... ");
          execute.submit(task1);
          execute.submit(task2);
          execute.submit(task3);




    }
}