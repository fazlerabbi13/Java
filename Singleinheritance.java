class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread1 is running");
    }
}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread2 is running");
    }
}

class Singleinheritance{
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}