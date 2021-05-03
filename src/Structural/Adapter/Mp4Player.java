package Structural.Adapter;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Play Mp4 "+filename);
    }
}
