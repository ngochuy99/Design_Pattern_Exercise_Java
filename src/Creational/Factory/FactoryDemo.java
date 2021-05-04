package Creational.Factory;

public class FactoryDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Shape square = shapeFactory.getShape("square");
        Shape rectangle = shapeFactory.getShape("rectangle");
        Shape unknown = shapeFactory.getShape("not supported");
        circle.draw();
        square.draw();
        rectangle.draw();
        unknown.draw();
    }
}
