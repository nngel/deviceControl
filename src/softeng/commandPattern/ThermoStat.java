package softeng.commandPattern;

public class ThermoStat extends Device implements Commands{
    int temperature;

    private final int $MAXTEMPERATURE;

    public ThermoStat() {
        $MAXTEMPERATURE = 100;
    }

    public void setTemperature(int temperature) {
        if(getPower()) {
            if (temperature > $MAXTEMPERATURE) {
                System.out.println("Temperature already maximum");
            }
            else if (temperature <= 0) {
                System.out.println("Brightness already minimum");
            }
            else this.temperature = temperature;

            System.out.println("Brightness set to " + getTemperature());
        }
        else System.out.println("Device Turned Off");
    }
    public void increase() {
        setTemperature(getTemperature() + 1);
    }
    public void decrease() {
        setTemperature(getTemperature() - 1);
    }

    public int getTemperature() {
        return this.temperature;
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

