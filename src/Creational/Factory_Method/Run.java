package Creational.Factory_Method;

public class Run {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.MotorBike);
        System.out.println(vehicle.getVehicleName());
    }
}
