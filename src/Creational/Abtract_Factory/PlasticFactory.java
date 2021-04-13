package Creational.Abtract_Factory;

import Creational.Abtract_Factory.Product.Chair.Chair;
import Creational.Abtract_Factory.Product.Chair.PlasticChair;
import Creational.Abtract_Factory.Product.Desk.Desk;
import Creational.Abtract_Factory.Product.Desk.PlasticDesk;

public class PlasticFactory extends FurnitureAbstractFactory{
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Desk createDesk() {
        return new PlasticDesk();
    }
}
