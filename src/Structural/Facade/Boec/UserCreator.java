package Structural.Facade.Boec;

public class UserCreator {
    private User admin,clerk,customer;
    public UserCreator() {
        admin = new Admin();
        clerk = new Clerk();
        customer = new Customer();
    }
    public void createAdmin(){
        admin.create();
    }
    public void createCustomer(){
        customer.create();
    }
    public void createClerk(){
        clerk.create();
    }
}
