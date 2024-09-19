package softeng.OLD_commandPattern;

public class Television extends Device{
    private int channel;
    private int volume;

   private final int $CHANNELS;
   private final int $VOLUMES;

    public Television(String name) {
        super(name);
        this.$CHANNELS = 100;
        this.$VOLUMES = 20;
        this.channel = 1;
        this.volume = 10;
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

            System.out.println("[d] TV channel: " + getChannel());
        }
        else System.out.println("[d] Device is Turned Off. Nothing to do.");
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
                System.out.println("[d] TV volume already Maxed out.");
            }
            else if (volume < 0) {
                System.out.println("[d] TV volume already Mined out.");
            }
            else this.volume = volume;

            System.out.println("[d] TV volume set to " + getVolume());
        }
        else System.out.println("[d] Device is Turned Off. Nothing to do.");
    }
    public int getVolume() {
        return volume;
    }


    @Override
    public void showInfo() {
        String line = "---------------------------------";
        System.out.println(line+"\n"
                + "Device Name\t: " + getName() + "\n"+"Channel\t\t: " + (getPower() ? getChannel() : "--") + "\n"
                + "Volume\t\t: " + (getPower() ? getVolume() : "--") + "\n"
                + "Power\t\t: " + (getPower() ? "Turned ON" : "Turned OFF") + "\n"+line);
    }

    @Override
    public void commandCode(int code) {
        switch (code) {
            case 1 -> {
                powerON();
                System.out.println("[d] Device turned ON");
            }
            case 2 -> {
                powerOFF();
                System.out.println("[d] Device turned OFF");
            }
            case 3 -> nextChannel();
            case 4 -> prevChannel();
            case 5 -> volumeUP();
            case 6 -> volumeDOWN();
        }
    }

    @Override
    public String commandList() {
        return """
                1. Power On
                2. Power Off
                3. Next Channel
                4. Previous Channel
                5. Volume Up
                6. Volume Down""";
    }
}

// nngel
