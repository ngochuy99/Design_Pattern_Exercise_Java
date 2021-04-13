package Creational.Abtract_Factory;

import Creational.Abtract_Factory.Product.Chair.Chair;
import Creational.Abtract_Factory.Product.Desk.Desk;

import java.nio.file.attribute.UserPrincipalNotFoundException;

public class Producer {
    public static void main(String[] args) throws UserPrincipalNotFoundException {
        FurnitureAbstractFactory factory = FurnitureFactory.getInstance(MaterialType.Plastic);
        Chair plasticChair = factory.createChair();
        plasticChair.create();
        Desk plasticDesk = factory.createDesk();
        plasticDesk.Create();
        FurnitureAbstractFactory woodFactory = FurnitureFactory.getInstance(MaterialType.Wood);
        Chair woodChair = woodFactory.createChair();
        woodChair.create();
        Desk woodDesk = woodFactory.createDesk();
        woodDesk.Create();
    }
}
