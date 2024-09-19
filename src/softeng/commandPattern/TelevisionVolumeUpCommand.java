package softeng.commandPattern;

public class TelevisionVolumeUpCommand implements Command {
    private Television television;

    public TelevisionVolumeUpCommand(Television television) {
        this.television = television;
    }

    public void changeTelevision(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.tvVolumeIncrease();
    }
}
