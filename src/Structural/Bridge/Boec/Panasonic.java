package Structural.Bridge.Boec;

public class Panasonic implements BrandAPI {
    @Override
    public void CreateElectronics(int id, String name, double price) {
        System.out.println("Creating Electronic id: "+id+" name: "+name+" with price: "+price);
    }
}
