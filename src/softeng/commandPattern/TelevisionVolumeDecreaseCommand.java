package softeng.commandPattern;

public class TelevisionVolumeDecreaseCommand implements Command {

    private Television television;

    public TelevisionVolumeDecreaseCommand(Television television) {
        this.television = television;
    }

    public void changeTelevision(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.tvVolumeDecrease();
    }
}
