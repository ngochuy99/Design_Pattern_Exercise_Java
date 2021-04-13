package Creational.Abtract_Factory.Product.Chair;

public class WoodChair implements Chair{
    @Override
    public void create() {
        System.out.println("Create Wood Chair");
    }
}
