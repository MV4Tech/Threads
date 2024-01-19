package Synchronized;

public class StaticSynchronizedExchanger {

    private static Object object = null;

    public static synchronized void setObject(Object o){
        object = o;
    }

    public static synchronized Object getObject(){
        return object;
    }

    // here our monitor will be StaticSynchronizedExchanger.class
    // because of static keyword
    public static void setObj(Object o){
        synchronized (StaticSynchronizedExchanger.class) {
            object = o;
        }
    }

    // here our monitor will be StaticSynchronizedExchanger.class
    // because of static keyword
    public static Object getObj(){
        synchronized (StaticSynchronizedExchanger.class) {
            return object;
        }
    }

}
