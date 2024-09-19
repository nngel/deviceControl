package softeng.commandPattern;

public class Client {
    public static void main(String[] args) {
        Lights livingRoom = new Lights();

        Command lightOFF = new LightsOffCommand(livingRoom);
        Command lightON = new LightsOnCommand(livingRoom);
        Command lightDarker = new LightsDarkerCommand(livingRoom);
        Command lightBright = new LightsBrighterCommand(livingRoom);

        RemoteHub remoteHub = new RemoteHub();

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
    }
}
