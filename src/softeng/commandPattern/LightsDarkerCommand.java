package softeng.commandPattern;

public class LightsDarkerCommand implements Command {

    Lights lights;

    public LightsDarkerCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.lightDarker();
    }
}
