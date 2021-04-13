package Creational.Abtract_Factory.Product.Desk;

public class WoodDesk implements Desk{
    @Override
    public void Create() {
        System.out.println("Create Wood Desk");
    }
}
