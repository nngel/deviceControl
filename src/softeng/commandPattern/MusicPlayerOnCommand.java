package softeng.commandPattern;

public class MusicPlayerOnCommand implements Command {

    private MusicPlayer musicPlayer;

    public MusicPlayerOnCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.musicON();
    }
}
