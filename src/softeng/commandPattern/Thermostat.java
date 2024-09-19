package softeng.commandPattern;

public class Thermostat {

    private boolean power;
    private int temperature;

    public Thermostat() {
        power = false;
        temperature = 16;
    }

    public void thermostatON() {
        this.power = true;
        System.out.println("Thermostat ON");
    }
    public void thermostatOFF() {
        this.power = false;
        System.out.println("Thermostat OFF");
    }
    public void thermostatIncreaseTemperature() {
        if(power) {
            temperature++;
            System.out.println("Temperature: " + temperature);
        }
        else System.out.println("Cannot Change Temperature (power off)");
    }
    public void thermostatDecreaseTemperature() {
        if(power) {
            temperature--;
            System.out.println("Temperature: " + temperature);
        }
        else System.out.println("Cannot Change Temperature (power off)");
    }
}
