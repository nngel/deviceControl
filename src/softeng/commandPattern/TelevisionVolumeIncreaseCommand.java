package softeng.commandPattern;

public class TelevisionVolumeIncreaseCommand implements Command {
    private Television television;

    public TelevisionVolumeIncreaseCommand(Television television) {
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
