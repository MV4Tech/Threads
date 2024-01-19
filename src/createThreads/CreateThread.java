package createThreads;

public class CreateThread {
    public static void main(String[] args){

        // 1. create thread by extending Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // 2. create thread by implementing Runnable interface
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // 3. create thread by anonymous class and Runnable interface
        Thread thread3 = new Thread(new Runnable(){

            @Override
            public void run() {
                System.out.println("Hello from a thread3!");
            }
        });
        thread3.start();

        // 4. create thread by lambda expression and Runnable interface

        // this way also work -  Thread thread4 = new Thread(() -> System.out.println("Hello from a thread4!"));
        Runnable runnable = () -> System.out.println("Hello from a thread4!");
        Thread thread4 = new Thread(runnable);
        thread4.start();
    }
}
