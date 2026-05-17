package Example2;

public class Mp3Player implements MediaPlayer{

    @Override
    public void play(String filname) {
        System.out.println("Playing MP3 file : "+ filname);
    }
}
