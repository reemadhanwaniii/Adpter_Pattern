package Example2;

public class MediaPlayerDemo {
    static void main() {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.playfile("movie.mp4");
        audioPlayer.playfile("documentary.vlc");
        audioPlayer.playfile("song.mp3");
        audioPlayer.playfile("image.png");
    }
}
