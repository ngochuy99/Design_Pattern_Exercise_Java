package Creational.Factory.Boec;


public class FactoryBoecDemo {
    public static void main(String[] args) {
        ItemFactory ItemFactory = new ItemFactory();
        Item book = ItemFactory.getItem("book");
        Item electronic = ItemFactory.getItem("electronic");
        Item clothes = ItemFactory.getItem("clothes");
        book.create();
        electronic.create();
        clothes.create();
    }
}
