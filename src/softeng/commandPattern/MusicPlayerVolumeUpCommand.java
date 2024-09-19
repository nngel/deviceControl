package softeng.commandPattern;

public class MusicPlayerVolumeUpCommand implements Command {

    private MusicPlayer musicPlayer;

    public MusicPlayerVolumeUpCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.musicVolumeUP();
    }
}
