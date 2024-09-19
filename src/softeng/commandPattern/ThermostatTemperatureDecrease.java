package softeng.commandPattern;

public class ThermostatTemperatureDecrease implements Command {

    private Thermostat thermostat;

    public ThermostatTemperatureDecrease(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void changeThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.thermostatDecreaseTemperature();
    }
}
