package softeng.commandPattern;

public class MusicPlayer {

    private boolean power;
    private int songIndex;
    private int volume;

    public MusicPlayer() {
        power = false;
        songIndex = 1;
        volume = 10;
    }

    public void musicON() {
        power = true;
        System.out.println("Music Player ON");
    }
    public void musicOFF() {
        power = false;
        System.out.println("Music Player OFF");
    }
    public void musicSongNext() {
        if (power) {
            songIndex++;
            System.out.println("Current song: Song " + songIndex);
        }
        else System.out.println("Cannot change song (device off)");
    }
    public void musicSongPrevious() {
        if (power) {
            songIndex--;
            System.out.println("Current song: Song " + songIndex);
        }
        else System.out.println("Cannot change song (device off)");
    }
    public void musicVolumeUP() {
        if(power) {
            volume++;
            System.out.println("Current volume: " + volume);
        }
        else System.out.println("Cannot change volume (device off)");
    }
    public void musicVolumeDOWN() {
        if(power) {
            volume--;
            System.out.println("Current volume: " + volume);
        }
        else System.out.println("Cannot change volume (device off)");
    }
}
