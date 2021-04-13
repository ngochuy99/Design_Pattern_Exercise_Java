package Creational.Singleton;

public class DoubleCheckLockingSingleton {
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton() {
    }
    //recheck
    public static synchronized DoubleCheckLockingSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance==null){
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }
}
