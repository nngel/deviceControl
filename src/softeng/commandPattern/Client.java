package softeng.commandPattern;

public class Client {
    public static void main(String[] args) {

        // Remote Hub
        RemoteHub remoteHub = new RemoteHub();

        // Lights

        Lights livingRoom = new Lights();
        Command lightOFF = new LightsOffCommand(livingRoom);
        Command lightON = new LightsOnCommand(livingRoom);
        Command lightDarker = new LightsDimmerCommand(livingRoom);
        Command lightBright = new LightsBrighterCommand(livingRoom);

        remoteHub.setCommand(lightOFF);
        remoteHub.pressButton();

        remoteHub.setCommand(lightON);
        remoteHub.pressButton();

        remoteHub.setCommand(lightBright);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(lightDarker);
        remoteHub.pressButton();

        // Television
        System.out.println();

        Television LivingRoomTelevision = new Television();
        Command tvon = new TelevisionOnCommand(LivingRoomTelevision);
        Command tvoff = new TelevisionOffCommand(LivingRoomTelevision);
        Command tvChannelNext = new TelevisionChannelNextCommand(LivingRoomTelevision);
        Command tvChannelPrevious = new TelevisionChannelPreviousCommand(LivingRoomTelevision);
        Command tvVolumeUp = new TelevisionVolumeIncreaseCommand(LivingRoomTelevision);
        Command tvVolumeDown  = new TelevisionVolumeDecreaseCommand(LivingRoomTelevision);

        remoteHub.setCommand(tvoff);
        remoteHub.pressButton();

        remoteHub.setCommand(tvon);
        remoteHub.pressButton();

        remoteHub.setCommand(tvChannelNext);
        remoteHub.pressButton();
        remoteHub.pressButton();
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(tvChannelPrevious);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(tvVolumeUp);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(tvVolumeDown);
        remoteHub.pressButton();
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(tvoff);
        remoteHub.pressButton();

        remoteHub.setCommand(tvChannelNext);
        remoteHub.pressButton();

        // Thermostat
        System.out.println();

        Thermostat thermostat = new Thermostat();

        Command thermostatON = new ThermostatOnCommand(thermostat);
        Command thermostatOFF = new ThermostatOffCommand(thermostat);
        Command thermostatIncrease = new ThermostatTemperatureIncreaseCommand(thermostat);
        Command thermostatDecrease = new ThermostatTemperatureDecrease(thermostat);

        remoteHub.setCommand(thermostatOFF);
        remoteHub.pressButton();

        remoteHub.setCommand(thermostatON);
        remoteHub.pressButton();

        remoteHub.setCommand(thermostatIncrease);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(thermostatDecrease);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(thermostatOFF);
        remoteHub.pressButton();

        remoteHub.setCommand(thermostatIncrease);
        remoteHub.pressButton();

        // Music Player
        System.out.println();

        MusicPlayer musicPlayer = new MusicPlayer();
        Command mpON = new MusicPlayerOnCommand(musicPlayer);
        Command mpOFF = new MusicPlayerOffCommand(musicPlayer);
        Command mpNext = new MusicPlayerSongNextCommand(musicPlayer);
        Command mpPrev = new MusicPlayerSongPreviousCommand(musicPlayer);
        Command mpVolUP = new MusicPlayerVolumeUpCommand(musicPlayer);
        Command mpVolDown = new MusicPlayerVolumeDownCommand(musicPlayer);

        remoteHub.setCommand(mpON);
        remoteHub.pressButton();

        remoteHub.setCommand(mpNext);
        remoteHub.pressButton();
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(mpPrev);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(mpVolUP);
        remoteHub.pressButton();
        remoteHub.pressButton();
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(mpVolDown);
        remoteHub.pressButton();
        remoteHub.pressButton();

        remoteHub.setCommand(mpOFF);
        remoteHub.pressButton();

        remoteHub.setCommand(mpNext);
        remoteHub.pressButton();

    }
}
