package Synchronized;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class SynchronizedLambda {
    private static Object object = null;

    public static synchronized void setObject(Object o){
        object = o;
    }

    public static void consumeObject(Consumer consumer){
        consumer.accept(object);
    }

}
