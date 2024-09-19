package softeng.commandPattern;

public class Client {
    public static void main(String[] args) {
        Lights livingRoom = new Lights();

        Command lightOFF = new LightsOffCommand(livingRoom);
        Command lightON = new LightsOnCommand(livingRoom);
        Command lightDarker = new LightsDarkerCommand(livingRoom);
        Command lightBright = new LightsBrighterCommand(livingRoom);

        RemoteHub remoteHub = new RemoteHub();

        remoteHub.setCommand(lightOFF);
        remoteHub.pressButton();

        remoteHub.setCommand(lightON);
        remoteHub.pressButton();

        remoteHub.setCommand(lightBright);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(lightDarker);
        remoteHub.pressButton();
    }
}
