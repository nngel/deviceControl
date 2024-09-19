package softeng.commandPattern;

public class TelevisionChannelNextCommand implements Command {

    private Television television;

    public TelevisionChannelNextCommand(Television television) {
        this.television = television;
    }

    public void changeTelevision(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        this.television.tvChannelNext();
    }
}
