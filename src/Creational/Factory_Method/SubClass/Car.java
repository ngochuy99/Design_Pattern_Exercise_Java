package Creational.Factory_Method.SubClass;

import Creational.Factory_Method.Vehicle;

public class Car implements Vehicle {
    @Override
    public String getVehicleName() {
        return "Car";
    }
}
