package createThreads;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello from a thread2!");
    }
}
