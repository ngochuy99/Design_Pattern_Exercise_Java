package Structural.Adapter;

public class VlcPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Play vlcFile "+fileName);
    }

    @Override
    public void playMp4(String filename) {

    }
}
