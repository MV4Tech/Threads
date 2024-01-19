package Synchronized;

public class SynchronizedExchanger {
    protected Object object = null;

    // 1. This method is synchronized, so only one thread can access it at a time.
    // We used synchronized keyword in method declaration.
    public synchronized void setObject(Object o){
        this.object = o;
    }

    // 1. This method is synchronized, so only one thread can access it at a time.
    // We used synchronized keyword in method declaration.
    public synchronized Object getObject(){
        return this.object;
    }

    // 2. This method is synchronized, so only one thread can access it at a time.
    // We create special block called synchronized block
    // and we used this as a lock also called monitor.
    public void setObj(Object o){
        synchronized(this){
            this.object = o;
        }
    }

    // 2. This method is synchronized, so only one thread can access it at a time.
    // We create special block called synchronized block
    // and we used this as a lock also called monitor.
    public Object getObj(){
        synchronized(this){
            return this.object;
        }
    }




}
