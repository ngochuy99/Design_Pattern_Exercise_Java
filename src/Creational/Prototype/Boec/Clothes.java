package Creational.Prototype.Boec;

public class Clothes extends Item {
    @Override
    public void create() {
        System.out.println("Create Clothes");
    }


    public Clothes() {
        type = "Clothes";
    }
}
