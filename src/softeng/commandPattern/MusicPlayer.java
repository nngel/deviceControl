package softeng.commandPattern;

public class MusicPlayer extends Device{
    int volume;
    int songIndex;

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public int getVolume() {
        return volume;
    }
    public void setSongIndex(int songIndex) {
        this.songIndex = songIndex;
    }
    public int getSongIndex() {
        return songIndex;
    }
}