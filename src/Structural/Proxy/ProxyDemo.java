package Structural.Proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //Load image from disk
        image.display();
        System.out.println("");

        //Not load image from disk
        image.display();
    }
}
