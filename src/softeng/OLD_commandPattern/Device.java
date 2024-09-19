package softeng.OLD_commandPattern;

public class Device implements Commands {
    private boolean power;
    private String name;

    public Device(String name) {
        powerOFF();
        this.name = name;
    }

   public boolean getPower() {
        return this.power;
    }
    public void powerON() {
        power = true;
    }
    public void powerOFF() {
        power = false;
    }public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public String deviceType() {
        return "Device";
    }

    public void showInfo() {}
    public void commandCode(int code) {}
    public String commandList() { return ""; }
}

// nngel
