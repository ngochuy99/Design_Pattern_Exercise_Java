package Creational.Singleton;

public class Eagerinit {
    private static final Eagerinit instance = new Eagerinit();

    private Eagerinit() {

    }

    public static Eagerinit getInstance(){
        return instance;
    }
}
