package Example2;

public class VlcPlayerAdapter implements MediaPlayer{

    private final VlcCodec codec;

    public VlcPlayerAdapter(VlcCodec codec) {
        this.codec  = codec;
    }

    @Override
    public void play(String filname) {
        this.codec.Vlc(filname);
    }
}
