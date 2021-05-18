package Creational.Abtract_Factory.Boec;

public class UserFactory extends AbstractFactory{
    public User getUser(String userType){
        if(userType == null){
            return null;
        }
        else if(userType.equalsIgnoreCase("Admin")){
            return new Admin();
        }
        else if(userType.equalsIgnoreCase("Clerk")){
            return new Clerk();
        }
        else if(userType.equalsIgnoreCase("Customer")){
            return new Customer();
        }
        return null;
    }

    @Override
    public Item getItem(String item) {
        return null;
    }
}
