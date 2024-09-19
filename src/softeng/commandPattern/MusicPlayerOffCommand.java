package softeng.commandPattern;

public class MusicPlayerOffCommand implements Command {

    private MusicPlayer musicPlayer;

    public MusicPlayerOffCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public void changeMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.musicOFF();
    }
}
