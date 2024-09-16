package softeng.commandPattern;

public class Lights extends Device implements Commands {

    private int brightness;
    private final int $MAXBRIGHTNESS;

    public Lights(String name){
        brightness = 0;
        $MAXBRIGHTNESS = 3;

        setName(name);
        powerOFF();
    }
    public void setBrightness(int brightness){
        if(getPower()) {
            if (brightness > $MAXBRIGHTNESS) {
                System.out.println("Brightness already maximum");
            }
            else if (brightness <= 0) {
                System.out.println("Brightness already minimum");
            }
            else this.brightness = brightness;

            System.out.println("Brightness set to " + getBrightness());
        }
        else System.out.println("Device Turned Off");
    }
    public void increaseBrightness() {
        setBrightness(getBrightness() + 1);
    }
    public void decreaseBrightness() {
        setBrightness(getBrightness() - 1);
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public void powerOFF() {
        setPower(false);
    }

    @Override
    public void powerON() {
        setPower(true);
    }

}
