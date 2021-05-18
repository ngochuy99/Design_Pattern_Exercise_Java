package Creational.Prototype.Boec;

public class Book extends Item {
    public Book() {
        type="Book";
    }

    @Override
    public void create() {
        System.out.println("Create Book");
    }
}
