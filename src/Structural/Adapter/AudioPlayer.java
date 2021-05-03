package Structural.Adapter;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("mp3")){
            System.out.println("Play mp3 "+fileName);
        }
        else if(audioType.equals("vlc")){
            System.out.println("Play vlc "+fileName);
        }
        else {
            System.out.println("Not supported");
        }
    }
}
