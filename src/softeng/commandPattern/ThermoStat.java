package softeng.commandPattern;

public class ThermoStat extends Device{
    boolean power;
    double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getTemperature() {
        return this.temperature;
    }
}

