package Creational.Abtract_Factory.Boec;



public class AbstractFactoryDemo {
    public static void main(String[] args) throws NullPointerException{
        AbstractFactory ItemFactory = FactoryProducer.getFactory("Item");
        Item book = ItemFactory.getItem("book");
        Item clothes = ItemFactory.getItem("clothes");
        Item electronic = ItemFactory.getItem("electronic");
        book.create();
        clothes.create();
        electronic.create();
        AbstractFactory UserFactory = FactoryProducer.getFactory("User");
        User admin = UserFactory.getUser("admin");
        User clerk = UserFactory.getUser("clerk");
        User customer = UserFactory.getUser("customer");
        admin.create();
        clerk.create();
        customer.create();
    }
}
