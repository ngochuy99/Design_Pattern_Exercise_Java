package Creational.Abtract_Factory.Product.Chair;

public class PlasticChair implements Chair{
    @Override
    public void create() {
        System.out.println("Create Plastic Chair");
    }
}
