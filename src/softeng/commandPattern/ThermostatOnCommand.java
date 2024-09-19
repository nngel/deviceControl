package softeng.commandPattern;

public class ThermostatOnCommand implements Command {

    private Thermostat thermostat;

    public ThermostatOnCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.thermostatON();
    }
}
