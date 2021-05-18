package Structural.Facade.Boec;

public class FacadeDemo {
    public static void main(String[] args) {
        UserCreator userCreator = new UserCreator();
        userCreator.createAdmin();
        userCreator.createClerk();
        userCreator.createCustomer();
    }
}
