package softeng.commandPattern;

public class Television {

    private boolean power;
    private int channel;
    private int volume;

    public Television() {
        power = false;
        channel = 1;
        volume = 10;
    }

    public void tvOff() {
        this.power = false;
        System.out.println("Television off");
    }
    public void tvOn() {
        this.power = true;
        System.out.println("Television on");
    }

    public void tvChannelNext() {
        if (power) {
            channel++;
            System.out.println("Television channel " + channel);
        }
        else System.out.println("Can't Change Channel (TV off)");
    }

    public void tvChannelPrev() {
        if (power) {
            channel--;
            System.out.println("Television channel " + channel);
        }
        else System.out.println("Can't Change Channel (TV off)");
    }

    public void tvVolumeIncrease() {
        if (power) {
            volume++;
            System.out.println("Television volume " + volume);
        }
        else System.out.println("Can't Change Volume (TV off)");
    }

    public void tvVolumeDecrease() {
        if (power) {
            volume--;
            System.out.println("Television volume " + volume);
        }
        else System.out.println("Can't Change Volume (TV off)");
    }

}
