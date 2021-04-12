package Creational.Factory_Method;

import Creational.Factory_Method.SubClass.Bus;
import Creational.Factory_Method.SubClass.Car;
import Creational.Factory_Method.SubClass.Motorbike;

public class VehicleFactory {
    public VehicleFactory() {
    }
    public static final Vehicle getVehicle(VehicleType Vehicle){
        switch (Vehicle){
            case Car -> {
                return new Car();
            }
            case Bus -> {
                return new Bus();
            }
            case MotorBike -> {
                return new Motorbike();
            }
            default -> {
                throw new IllegalArgumentException("Not supported Yet");
            }
        }
    }
}
