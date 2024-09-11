package softeng.commandPattern;

public class Lights extends Device {
    boolean power;
    double brightness;

    public void setBrightness(double brightness) {
        this.brightness = brightness;
    }
    public double getBrightness() {
        return brightness;
    }
}
