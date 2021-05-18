package Creational.Prototype.Boec;

public class Electronic extends Item {
    @Override
    public void create() {
        System.out.println("Create Electronic");
    }

    public Electronic() {
        type = "Electronic";
    }
}
