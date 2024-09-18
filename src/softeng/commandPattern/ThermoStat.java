package softeng.commandPattern;

public class ThermoStat extends Device implements Commands{
    int temperature;

    private final int $MAXTEMPERATURE;

    public ThermoStat(String name) {
        setName(name);
        temperature = 26;
        $MAXTEMPERATURE = 100;
    }

    public void setTemperature(int temperature) {
        if(getPower()) {
            if (temperature > $MAXTEMPERATURE) {
                System.out.println("[d] Temperature already maximum");
            }
            else if (temperature <= 0) {
                System.out.println("[d] Brightness already minimum");
            }
            else this.temperature = temperature;

            System.out.println("[d] Brightness set to " + getTemperature());
        }
        else System.out.println("[d] Device is Turned Off. Nothing to do.");
    }
    public void increase() {
        setTemperature(getTemperature() + 1);
    }
    public void decrease() {
        setTemperature(getTemperature() - 1);
    }

    public int getTemperature()
    {
        return this.temperature;
    }

    @Override
    public void showInfo() {
        String line = "---------------------------------";
        System.out.println(line+"\n"
                +"Device Name\t: " + getName() + "\n"+"Temperature\t: " + (getPower() ? getTemperature() : "--") + " °C\n"
                +"Power\t\t: " + (getPower() ? "Turned ON" : "Turned OFF") + "\n"+line);
    }

    @Override
    public void commandCode(int code) {
        switch (code) {
            case 1 -> {
                powerON();
                System.out.println("[d] Device turned ON");
            }
            case 2 -> {
                powerOFF();
                System.out.println("[d] Device turned OFF");
            }
            case 3 -> increase();
            case 4 -> decrease();
        }
    }

    @Override
    public String commandList() {
        return """
                1. Power On
                2. Power Off
                3. Increase Temperature
                4. Decrease Temperature""";
    }
}

// nngel

