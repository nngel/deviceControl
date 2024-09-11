package softeng.commandPattern;

import java.util.LinkedList;

public class MusicPlayer extends Device{
    private int volume;
    private int songIndex;
    private LinkedList<LinkedList<String>> songlist = new LinkedList<>();

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

    public void addPlaylist(String playlistName, LinkedList<String> songList) {
        songList.addFirst(playlistName);
        songlist.add(songList);
        System.out.println("List index "+songlist.size());
    }
}