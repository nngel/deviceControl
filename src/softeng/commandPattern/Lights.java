package softeng.commandPattern;

public class Lights extends Device {

    int brightness;

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    public int getBrightness() {
        return brightness;
    }
}
