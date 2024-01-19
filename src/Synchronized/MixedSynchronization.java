package Synchronized;

public class MixedSynchronization {
    // here we have one static and one instance variable
    // if we have 2 threads each thread will access one of the methods simultaneously
    // because static monitor is class itself and instance variable monitor is object itself
    // and that's 2 different monitors
    // but if 2 threads try to share one method, they will be blocked because of synchronized block
    public static Object staticObj=null;

    public static synchronized void setStaticObj(Object obj){
        staticObj = obj;
    }

    public Object instanceObj = null;

    public synchronized void setInstanceObj(Object obj){
        this.instanceObj = obj;
    }

}
