package softeng.commandPattern;

public class LightsBrighterCommand implements Command {
    Lights lights;

    public LightsBrighterCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.lightBrighter();
    }
}
