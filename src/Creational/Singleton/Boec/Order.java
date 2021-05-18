package Creational.Singleton.Boec;

public class Order {
    private Book book;
    private Clothes clothes;
    private static Order instance = new Order();
    public Order() {
    }
     public static Order getInstance(){
        return instance;
     }
    public void showMessage(){
        System.out.println("Order instace created");
    }
}
