package softeng.commandPattern;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) {

        MusicPlayer musikk = new MusicPlayer();
        LinkedList<String> playlist1 = new LinkedList<>();
        playlist1.add("mama mo");

        musikk.addPlaylist("Playlist 1", playlist1);


    }
}
