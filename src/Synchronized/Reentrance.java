package Synchronized;

public class Reentrance {

    // boths methods are synchronized
    // so if we call one method from another, we will not get deadlock
    // because we have only one monitor
    private int count = 0;

    public synchronized void inc(){
        this.count++;
    }

    public synchronized int incAndGet(){
        inc();
        return this.count;
    }
}
