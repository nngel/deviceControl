package softeng.commandPattern;

public class Lights extends Device implements Commands {

    private int brightness;

    public Lights(){
        brightness = 0;
        powerOFF();
    }
    public void increaseBrightness() {
       if(getPower())
       {
           if(getBrightness() >= 3) {
               System.out.println("Brightness Already Maximum");
           }
           else {
               brightness++;
               System.out.println("Brightness Increased. Light level: " + brightness);
           }
       }
       else
       {
           System.out.println("Turn on the device first.");
       }
    }
    public void decreaseBrightness() {
       if(getPower())
       {
           if(getBrightness() <= 1) {
               System.out.println("Brightness Already Minimum");
           }
           else {
               brightness--;
               System.out.println("Brightness Decreased. Light level: " + brightness);
           }
       }
       else
       {
           System.out.println("Turn on the device first.");
       }
    }

    public int getBrightness() {
        return brightness;
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
