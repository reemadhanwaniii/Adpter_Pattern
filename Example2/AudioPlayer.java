package Example2;

public class AudioPlayer {
    public void playfile(String filename) {
        MediaPlayer player;
        String extension = filename.substring(filename.lastIndexOf('.')+1).toLowerCase();

        switch (extension) {
            case "mp3":
                player = new Mp3Player();
                break;
            case "mp4" :
                player = new Mp4PlayerAdapter(new Mp4Codec());
                break;
            case "vlc" :
                player = new VlcPlayerAdapter(new VlcCodec());
                break;
            default:
                System.out.println("Unsupported format : "+extension);
                return;
        }

        player.play(filename);
    }
}
