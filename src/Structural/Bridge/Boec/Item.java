package Structural.Bridge.Boec;

public abstract class Item {
    protected BrandAPI brandAPI;
    protected Item(BrandAPI brandAPI){
        this.brandAPI = brandAPI;
    }
    public abstract void Create();
}
