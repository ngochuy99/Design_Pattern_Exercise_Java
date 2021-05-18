package Creational.Abtract_Factory.Boec;

public class Customer implements User{
    private int id;
    private String address,name;

    public Customer() {
    }

    @Override
    public void create() {
        System.out.println("Create Customer");
    }
}
