package Structural.Decorator.Boec;

public class DecoratorDemo {
    public static void main(String[] args) {
        Clothes suit = new Suit();
        Clothes blakcSuit = new ColorClothesDecorator(new Suit(),"black");
        Clothes greenPant = new ColorClothesDecorator(new TShirt(),"green");
        suit.create();
        greenPant.create();
        blakcSuit.create();
    }
}
