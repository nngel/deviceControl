package softeng.commandPattern;

public class Television extends Device{
    int channel;
    int volume;

    public Television() {
        channel = 0;
    }

    public void nextChannel() {
        this.channel++;
    }
    public void prevChannel() {
        this.channel--;
    }
    public void setChannel(int channel) {
        this.channel = channel;
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
}
