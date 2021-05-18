package Structural.Decorator.Boec;

public class ColorClothesDecorator extends ClothesDecorator {
    public ColorClothesDecorator(Clothes decoratedClothes,String color) {
        super(decoratedClothes,color);
    }

    @Override
    public void create() {
        decoratedClothes.create();
        setColor(decoratedClothes,color);
    }
    private void setColor(Clothes decoratedClothes,String color){
        System.out.println("Add new "+color+" color");
    }
}
