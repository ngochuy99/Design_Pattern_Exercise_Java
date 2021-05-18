package Creational.Singleton.Boec;


public class SingletonBoecDemo {
    public static void main(String[] args) {
        Order order = Order.getInstance();
        order.showMessage();
    }
}
