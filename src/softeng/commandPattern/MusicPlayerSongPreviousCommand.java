package softeng.commandPattern;

public class MusicPlayerSongPreviousCommand implements Command {

    private MusicPlayer musicPlayer;

    public MusicPlayerSongPreviousCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public void changeMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.musicSongPrevious();
    }
}
