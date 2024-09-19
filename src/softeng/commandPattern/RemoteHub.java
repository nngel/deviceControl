package softeng.commandPattern;

public class RemoteHub {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton () {
        this.command.execute();
    }
}
