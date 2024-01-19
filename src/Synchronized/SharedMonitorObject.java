package Synchronized;

public class SharedMonitorObject {

    // here our monitor will be object that we pass to constructor
    // monitor must not be null

    private Object monitor = null;

    private int counter = 0;

    public SharedMonitorObject(Object monitor){
        if(monitor == null){
            throw new IllegalArgumentException("monitor cannot be null");
        }
        this.monitor = monitor;
    }

    public void incCounter(){
        synchronized(this.monitor){
            this.counter++;
        }
    }

}
