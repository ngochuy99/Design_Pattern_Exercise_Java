package Structural.Adapter;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer mediaPlayer;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equals("vlc")){
            mediaPlayer.playVlc(fileName);
        }
        else {
            mediaPlayer.playMp4(fileName);
        }
    }

    public MediaAdapter(String audioType) {
        if(audioType.equals("vlc")){
            mediaPlayer = new VlcPlayer();
        }
        else {
            mediaPlayer = new Mp4Player();
        }
    }
}
