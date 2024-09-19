package softeng.commandPattern;

public class Client {
    public static void main(String[] args) {
        Lights livingRoom = new Lights();

        Command lightOFF = new LightsOffCommand(livingRoom);
        Command lightON = new LightsOnCommand(livingRoom);

        RemoteHub remoteHub = new RemoteHub();

        remoteHub.setCommand(lightOFF);
        remoteHub.pressButton();

        remoteHub.setCommand(lightON);
        remoteHub.pressButton();
    }
}
