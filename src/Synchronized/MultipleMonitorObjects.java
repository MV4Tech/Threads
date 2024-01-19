package Synchronized;

public class MultipleMonitorObjects {
    // here we have two monitors
    // if we have 2 threads and each thread will access one of the methods simultaneously
    // but if 2 threads try to share one method, they will be blocked because of synchronized block
    private Object monitor1 = new Object();
    private Object monitor2 = new Object();

    private int counter1 = 0;
    private int counter2 = 0;

    public void incCounter1(){
        synchronized(monitor1){
            this.counter1++;
        }
    }

    public void incCounter2(){
        synchronized(monitor2){
            this.counter2++;
        }
    }


}
