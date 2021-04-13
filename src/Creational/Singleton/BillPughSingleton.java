package Creational.Singleton;

public class BillPughSingleton {
    private BillPughSingleton() {
    }
    public static BillPughSingleton getInstance(){
        return SingleTonHelper.instance;
    }
    private static class SingleTonHelper{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }
}
