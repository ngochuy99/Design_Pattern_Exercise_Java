package Creational.Abtract_Factory;

import Creational.Abtract_Factory.Product.Chair.Chair;
import Creational.Abtract_Factory.Product.Chair.PolymerChair;
import Creational.Abtract_Factory.Product.Desk.Desk;
import Creational.Abtract_Factory.Product.Desk.PolymerDesk;

public class PolymerFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PolymerChair();
    }

    @Override
    public Desk createDesk() {
        return new PolymerDesk();
    }
}
