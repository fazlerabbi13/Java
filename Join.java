import java.lang.*;


public class Join implements Runnable{
      public void run(){
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        System.out.println(t1.isAlive());
      }

      public static void main(String[] args) {
          Thread t = new Thread(new Join());
          t.start();

          try{
            t.join(3000);
          }catch(InterruptedException e){
            System.out.println(e);
          }

          System.out.println(t.getName());

          System.out.println(t.isAlive());
      }
 }

