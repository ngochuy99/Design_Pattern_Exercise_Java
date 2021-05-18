package Structural.Flyweight.Boec;


import java.util.Random;

public class FlyWeightDemo {

    private static final String type[] = {"book","clothes","electronic"};
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            Random random = new Random();
            int pos = random.nextInt(type.length);
            Item item = (Item) ItemFactory.getItem(type[pos]);
            item.create();
        }
    }
}
