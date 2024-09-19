package softeng.commandPattern;

public class LightsDimmerCommand implements Command {

    Lights lights;

    public LightsDimmerCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        lights.lightDimmer();
    }
}
