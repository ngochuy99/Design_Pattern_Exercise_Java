package Creational.Singleton;

public class ThreadSafeLazyInitializedSingleton {
    private ThreadSafeLazyInitializedSingleton(){

    }

    private static volatile ThreadSafeLazyInitializedSingleton instance;

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance(){
        if(instance==null){
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }
}
