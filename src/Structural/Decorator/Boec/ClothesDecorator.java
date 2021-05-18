package Structural.Decorator.Boec;

public class ClothesDecorator implements Clothes {
    protected Clothes decoratedClothes;
    protected String color;

    public ClothesDecorator(Clothes decoratedClothes,String color) {
        this.decoratedClothes = decoratedClothes;
        this.color = color;
    }

    @Override
    public void create() {
        decoratedClothes.create();
    }
}
