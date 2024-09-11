package softeng.commandPattern;

public class Device {
    boolean power;

    public void powerON() {
        this.power = true;
    }
    public void powerOFF() {
        this.power = false;
    }
    public boolean getPower() {
        return this.power;
    }
}
