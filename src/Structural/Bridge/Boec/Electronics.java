package Structural.Bridge.Boec;

public class Electronics extends Item {
    private int id;
    private String name;
    private double price;

    public Electronics(BrandAPI brandAPI, int id, String name, double price) {
        super(brandAPI);
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public void Create() {
        brandAPI.CreateElectronics(id,name,price);
    }
}
