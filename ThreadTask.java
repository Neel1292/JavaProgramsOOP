public class ThreadTask extends Thread {
    public void run(){
        
        for(int i = 0; i<=10;i++)
        {  
            System.out.println("Child Thread");
        }
    }

        public static void main(String args[]) {
          
          ThreadTask tobj = new ThreadTask();
          tobj.start();
          
          for(int i = 0; i<=10; i++) {

            System.out.println("New Threaad");
          }
    }
}