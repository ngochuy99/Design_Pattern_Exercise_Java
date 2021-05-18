package Creational.Factory.Boec;

public class Electronic implements Item{
    private int id;
    private String name;

    @Override
    public void create() {
        System.out.println("Create Electronic");
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

    public Electronic() {
    }
}
