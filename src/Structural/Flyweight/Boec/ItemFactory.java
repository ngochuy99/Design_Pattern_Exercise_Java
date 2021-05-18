package Structural.Flyweight.Boec;


public class ItemFactory {
    public static Item getItem(String itemType){
        if(itemType == null){
            return null;
        }
        else if(itemType.equalsIgnoreCase("Book")){
            return new Book();
        }
        else if(itemType.equalsIgnoreCase("Clothes")){
            return new Clothes();
        }
        else if(itemType.equalsIgnoreCase("Electronic")){
            return new Electronic();
        }
        return null;
    }
}
