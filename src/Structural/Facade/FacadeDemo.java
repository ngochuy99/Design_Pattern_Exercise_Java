package Structural.Facade;

public class FacadeDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRetangle();
        shapeMaker.drawSquare();
    }
}
