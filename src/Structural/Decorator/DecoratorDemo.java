package Structural.Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        circle.draw();
        redRectangle.draw();
        redCircle.draw();
    }
}
