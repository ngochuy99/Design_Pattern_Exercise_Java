package Creational.Prototype.Boec;


public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ItemCache.loadCache();
        Item clonedItem = ItemCache.getItem("1");
        System.out.println("Item : " + clonedItem.getType());
        clonedItem.create();
        Item clonedItem2 = ItemCache.getItem("2");
        System.out.println("Item : " + clonedItem2.getType());
        clonedItem2.create();
        Item clonedItem3 = ItemCache.getItem("3");
        System.out.println("Item : " + clonedItem3.getType());
        clonedItem3.create();
    }
}
