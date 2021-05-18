package Creational.Abtract_Factory.Boec;

public class Clerk implements User{
    private int id;
    private String address,name;

    public Clerk() {
    }

    @Override
    public void create() {
        System.out.println("Create Clerk");
    }
}
