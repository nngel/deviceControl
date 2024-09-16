package softeng.commandPattern;

public class ThermoStat extends Device implements Commands{
    double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void increase() {
       if(getPower()) {
           this.temperature++;
       }
       else System.out.println("Please turn on power: ");

    }
    public void decrease() {
        if(getPower()) {
            this.temperature--;
        }
        else System.out.println("Please turn on power: ");
    }

    public double getTemperature() {
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

