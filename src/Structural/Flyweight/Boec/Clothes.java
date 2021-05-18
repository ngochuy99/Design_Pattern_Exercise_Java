package Structural.Flyweight.Boec;

public class Clothes implements Item {
    private int id;
    private String name;

    @Override
    public void create() {
        System.out.println("Create Clothes");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Clothes() {
    }
}
