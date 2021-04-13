package Creational.Abtract_Factory.Product.Chair;

public class PolymerChair implements Chair{
    @Override
    public void create() {
        System.out.println("Create Polymer Chair");
    }
}
