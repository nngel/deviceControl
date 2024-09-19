package softeng.commandPattern;

public class TelevisionOffCommand implements Command {

    private Television television;

    public TelevisionOffCommand(Television television) {
        this.television = television;
    }

    public void changeTelevision(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.tvOff();
    }
}
