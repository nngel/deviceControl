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
                System.out.println("[d] Brightness already maximum");
            }
            else if (brightness <= 0) {
                System.out.println("[d] Brightness already minimum");
            }
            else this.brightness = brightness;

            System.out.println("[d] Brightness set to " + getBrightness());
        }
        else System.out.println("[d] Device is Turned Off. Nothing to do.");
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
    public void showInfo() {

        String sb = "---------------------------" + "\n" +
                "Device Name:\t" + getName() + "\n" +
                "Brightness:\t" + getBrightness() + "\n" +
                "Power:\t" + getPower() + "\n" +
                "---------------------------";

        System.out.println(sb);
    }

    @Override
    public void commandCode(int code) {
        switch (code)
        {
            case 1 -> {
                powerON();
                System.out.println("[d] Device turned ON");
            }
            case 2 -> {
                powerOFF();
                System.out.println("[d] Device turned OFF");
            }
            case 3 -> increaseBrightness();
            case 4 -> decreaseBrightness();
        }
    }

    @Override
    public String commandList() {
        return """
                1. Power On
                2. Power Off
                3. Increase Brightness
                4. Decrease Brightness""";
    }

}
