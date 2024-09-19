package softeng.commandPattern;

public class Lights {

    private boolean power;
    private int brightness;

    public Lights() {
        power = false;
        brightness = 2;
    }
    public void lightOff() {
        this.power = false;
        System.out.println("Turning off lights");
    }
    public void lightOn() {
        this.power = true;
        System.out.println("Lights on");
    }
    public void lightBrighter() {
       if (power) {
           brightness++;
           System.out.println("Brightness set to: " + brightness);
       }
       else System.out.println("Can't Change Brightness (Device turned off).");
    }
    public void lightDarker() {
       if (power) {
           brightness--;
           System.out.println("Brightness set to: " + brightness);
       }
       else System.out.println("Can't Change Brightness (Device turned off).");
    }
}
