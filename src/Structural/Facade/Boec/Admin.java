package Structural.Facade.Boec;

public class Admin implements User {
    private int id;
    private String address,name;

    public Admin() {
    }

    @Override
    public void create() {
        System.out.println("Create Admin");
    }
}
