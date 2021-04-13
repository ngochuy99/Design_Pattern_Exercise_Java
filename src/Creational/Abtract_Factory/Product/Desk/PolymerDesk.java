package Creational.Abtract_Factory.Product.Desk;

public class PolymerDesk implements Desk{
    @Override
    public void Create() {
        System.out.println("Create Polymer Desk");
    }
}
