package softeng.commandPattern;

public class Television extends Device implements Commands{
    private int channel;
    private int volume;

   private final int $CHANNELS;
   private final int $VOLUMES;

    public Television() {
        this.$CHANNELS = 100;
        this.$VOLUMES = 20;
        this.channel = 1;
        this.volume = 10;
        powerOFF();
    }

    public void nextChannel() {
        setChannel(getChannel() + 1);
    }
    public void prevChannel() {
       setChannel(getChannel() - 1);
    }
    public void setChannel(int channel) {
        if (getPower()) // is true
        {
            if (channel > $CHANNELS) {
                this.channel = 1;
            }
            else if (channel < 1) {
                this.channel = $CHANNELS;
            }
            else this.channel = channel;

            System.out.println("TV channel: " + getChannel());
        }
        else System.out.println("Device is Turned Off. Nothing to do.");
    }
    public int getChannel() {
        return channel;
    }

    public void volumeUP() {
        setVolume(getVolume() + 1);
    }
    public void volumeDOWN() {
        setVolume(getVolume() - 1);
    }

    public void setVolume(int volume) {
        if(getPower()) {
            if(volume > $VOLUMES) {
                System.out.println("TV volume already Maxed out.");
            }
            else if (volume < 0) {
                System.out.println("TV volume already Mined out.");
            }
            else this.volume = volume;

            System.out.println("TV volume set to " + getVolume());
        }
        else System.out.println("Device is Turned Off. Nothing to do.");
    }
    public int getVolume() {
        return volume;
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
