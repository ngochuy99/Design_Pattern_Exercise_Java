package Creational.Abtract_Factory.Boec;


public class ItemFactory extends AbstractFactory{
    public Item getItem(String itemType){
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

    @Override
    public User getUser(String user) {
        return null;
    }
}
