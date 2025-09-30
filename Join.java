import java.lang.*;


public class Join implements Runnable{
      public void run(){
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        System.out.println(t1.isAlive());
      }

      public static void main(String[] args) {
          
      }
 }

