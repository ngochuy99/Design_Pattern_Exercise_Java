package Creational.Singleton;

public class StaticBlockInitialization {
    private  StaticBlockInitialization() {
    }

    private static final StaticBlockInitialization instance;

    static {
        try {
            instance = new StaticBlockInitialization();
        }
        catch (Exception ex){
            throw new RuntimeException("Exception occured");
        }
    }

    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}
