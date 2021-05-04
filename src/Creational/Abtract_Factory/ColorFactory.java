package Creational.Abtract_Factory;

public class ColorFactory extends AbstractFactory{
    @Override
    Color getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("RED")){
            return new Red();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
