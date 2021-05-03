package Structural.Bridge;

public class RedCircle implements DrawAPI{
    @Override
    public void DrawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle:[Color:Red,radius:"+radius+",x:"+x+",y:"+y+")");
    }
}
