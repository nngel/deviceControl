package softeng.commandPattern;

public class MusicPlayerVolumeDownCommand implements Command {

    private MusicPlayer musicPlayer;

    public MusicPlayerVolumeDownCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }
    public void changeMusicPlayer(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.musicVolumeDOWN();
    }
}
