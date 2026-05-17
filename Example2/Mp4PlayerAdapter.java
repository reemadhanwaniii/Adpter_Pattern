package Example2;

public class Mp4PlayerAdapter implements MediaPlayer{

    private final Mp4Codec codec;

    public Mp4PlayerAdapter(Mp4Codec codec) {
        this.codec = codec;
    }

    @Override
    public void play(String filname) {
        this.codec.playMp4(filname);
    }
}
