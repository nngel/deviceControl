package softeng.commandPattern;

public class ThermostatTemperatureIncreaseCommand implements Command {

    private Thermostat thermostat;

    public ThermostatTemperatureIncreaseCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    public void changeThermostat(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.thermostatIncreaseTemperature();
    }
}
