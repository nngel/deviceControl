package softeng.commandPattern;

public class Television extends Device implements Commands{
    private int channel;
    private int volume;

   private final int _MAXCHANNEL = 100;
   private final int _MAXVOLUME = 20;

    public Television() {
        channel = 1;
    }

    public void nextChannel() {
        setChannel(getChannel() + 1);
    }
    public void prevChannel() {
       setChannel(getChannel() - 1);
    }
    public void setChannel(int channel) {

        if (channel > _MAXCHANNEL) {
            this.channel = 1;
        }
        else if (channel < 1) {
            this.channel = _MAXCHANNEL;
        }
        else this.channel = channel;

        System.out.println("TV channel: " + getChannel());
    }
    public int getChannel() {
        return channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
