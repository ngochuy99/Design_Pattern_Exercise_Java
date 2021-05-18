package Structural.Bridge.Boec;

public class BridgeDemo {
    public static void main(String[] args) {
        Item LGItem = new Electronics(new LG(),10,"Television",500000);
        Item PanasonicItem = new Electronics(new Panasonic(),15,"Air Condition",1000000);
        LGItem.Create();
        PanasonicItem.Create();
    }
}
