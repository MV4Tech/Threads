package Synchronized;

public class SharedMonitorObjectMain {
    public static void main(String[] args) {
        Object monitor1 = new Object();

        // never user string as monitor or primitives
        SharedMonitorObject smo1 = new SharedMonitorObject(monitor1);
        SharedMonitorObject smo2 = new SharedMonitorObject(monitor1);

        // smo1 and smo2 will use the same monitor
        // because we pass the same object to constructor
        // so smo1 and smo2 will be synchronized
        // smo1 and smo2 will not be synchronized with smo3
        // because smo3 uses different monitor

        smo1.incCounter();
        smo2.incCounter();

        Object monitor2 = new Object();

        SharedMonitorObject smo3 = new SharedMonitorObject(monitor2);
        smo3.incCounter();

    }
}
