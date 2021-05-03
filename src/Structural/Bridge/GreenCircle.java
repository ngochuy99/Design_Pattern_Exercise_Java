package Structural.Bridge;

public class GreenCircle implements DrawAPI{
    @Override
    public void DrawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle:[Color:Green,radius:"+radius+",x:"+x+",y:"+y+")");
    }
}
