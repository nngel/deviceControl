package softeng.commandPattern;

public class TelevisionChannelPreviousCommand implements Command {

    private Television television;

    public TelevisionChannelPreviousCommand(Television television) {
        this.television = television;
    }

    public void changeTelevision(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.tvChannelPrev();
    }
}
