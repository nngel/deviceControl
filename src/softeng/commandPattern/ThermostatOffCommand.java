package softeng.commandPattern;

public class ThermostatOffCommand implements Command {

    private Thermostat thermostat;

    public ThermostatOffCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.thermostatOFF();
    }
}
