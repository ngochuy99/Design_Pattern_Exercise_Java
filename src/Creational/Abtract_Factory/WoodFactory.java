package Creational.Abtract_Factory;

import Creational.Abtract_Factory.Product.Chair.Chair;
import Creational.Abtract_Factory.Product.Chair.WoodChair;
import Creational.Abtract_Factory.Product.Desk.Desk;
import Creational.Abtract_Factory.Product.Desk.WoodDesk;

public class WoodFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Desk createDesk() {
        return new WoodDesk();
    }
}
