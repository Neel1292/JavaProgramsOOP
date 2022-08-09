class ThreadStart {

    public void start() {  // if we comment the start method it will implicitly call for run mrethod

        System.out.println("start method call");
    }

    public void run() { // if we want to call the run methode inherit the Thread class 
    // but it will call main thread and then run method

        System.out.println("\n");
        System.out.println("run method call");

    }
}

public class ThreadStartEx {
        public static void main(String args[]) {
          
          ThreadStart thobj = new ThreadStart();
          thobj.start();
          System.out.println("\nmain thread");
    }
}