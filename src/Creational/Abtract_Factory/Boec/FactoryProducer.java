package Creational.Abtract_Factory.Boec;


public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Item")){
            return new ItemFactory();
        }
        else if(choice.equalsIgnoreCase("User")){
            return new UserFactory();
        }
        return null;
    }
}
