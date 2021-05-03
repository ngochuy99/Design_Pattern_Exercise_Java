package Structural.Adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","hello world");
        audioPlayer.play("vlc","hello world part 2");
    }
}
