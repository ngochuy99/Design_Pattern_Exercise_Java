package Creational.Abtract_Factory;

public class AbstractFactoryDemo {
    public static void main(String[] args) throws NullPointerException{
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");
        Shape rectangle = shapeFactory.getShape("rectangle");
        circle.draw();
        square.draw();
        rectangle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        Color blue = colorFactory.getColor("blue");
        Color green = colorFactory.getColor("green");
        red.fill();
        blue.fill();
        green.fill();
    }
}
