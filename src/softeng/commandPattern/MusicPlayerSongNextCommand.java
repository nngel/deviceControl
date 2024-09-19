package softeng.commandPattern;

public class MusicPlayerSongNextCommand implements Command {

    private MusicPlayer musicPlayer;

    public MusicPlayerSongNextCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.musicSongNext();
    }
}
