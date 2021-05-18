package Creational.Prototype.Boec;


import java.util.Hashtable;

public class ItemCache {
    private static Hashtable<String, Item> ItemMap = new Hashtable<>();

    public static Item getItem(String ItemId) throws CloneNotSupportedException {
        Item cachedItem = ItemMap.get(ItemId);
        return (Item) cachedItem.clone();
    }

    public static void loadCache() {
        Book book = new Book();
        book.setId(1);
        ItemMap.put(String.valueOf(book.getId()), book);
        Clothes clothes = new Clothes();
        clothes.setId(2);
        ItemMap.put(String.valueOf(clothes.getId()),clothes);
        Electronic electronic = new Electronic();
        electronic.setId(3);
        ItemMap.put(String.valueOf(electronic.getId()),electronic);
    }
}
