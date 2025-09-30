
class ThreadName extends Thread{
    @Override
    public void run(){
        System.out.println("Fetch current thread name.");

        System.out.println(Thread.currentThread().getName());
    }
}
public class NameThread {
    public static void main(String[] args) {
        ThreadName t1 = new ThreadName();
        ThreadName t2 = new ThreadName();

        t1.start();
        t2.start();
    }
}
