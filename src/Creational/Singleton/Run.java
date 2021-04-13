package Creational.Singleton;

public class Run {
    public static void main(String[] args) {
//      Eager initialization
        Eagerinit instanceOne = Eagerinit.getInstance();
        System.out.println(instanceOne.hashCode());
        Eagerinit instanceTwo = Eagerinit.getInstance();
        System.out.println(instanceTwo.hashCode());
//      Static Block Initialization
        StaticBlockInitialization staticinstance = StaticBlockInitialization.getInstance();
        System.out.println("Static Block Init: "+staticinstance.hashCode());
//      Lazy Initialization
        LazyInitialization lazyinstance = LazyInitialization.getInstance();
        System.out.println("Lazy Init "+lazyinstance.hashCode());
//      ThreadSafeInitializedSingleton
        ThreadSafeLazyInitializedSingleton threadSafeLazyInitializedSingleton = ThreadSafeLazyInitializedSingleton.getInstance();
        System.out.println("Thread safe:"+threadSafeLazyInitializedSingleton.hashCode());
    }
}
