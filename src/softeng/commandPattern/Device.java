package softeng.commandPattern;

public class Device {
    private boolean power;
    private String name;

   public boolean getPower() {
        return this.power;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void powerON() {
        power = true;
    }
    public void powerOFF() {
        power = false;
    }

    public void showInfo() {}
    public void commandCode(int code) {}
    public String commandList() { return ""; }
}
