package Creational.Abtract_Factory;

import Creational.Abtract_Factory.Product.Chair.Chair;
import Creational.Abtract_Factory.Product.Desk.Desk;

public abstract class FurnitureAbstractFactory {
    public abstract Chair createChair();
    public abstract Desk createDesk();
}
