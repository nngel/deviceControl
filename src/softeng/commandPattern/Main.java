package softeng.commandPattern;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        ControlPanel cp = new ControlPanel();
        Scanner scan = new Scanner(System.in);

        System.out.print("Use Preset Devices? [y/n]: ");
        if(scan.nextLine().toLowerCase().charAt(0) == 'y')
        {
            cp.add(new Lights("Living Room Lights"));
            cp.add(new Lights("Bedroom Lights"));
            cp.add(new Television("Living Room TV"));
            cp.add(new ThermoStat("Home Thermostat"));

            cp.list();
        }

        boolean loop = true;
        while (loop) {
            System.out.println
                    ("""
                            Menu:
                            1. Add Device
                            2. Select Device
                            3. Device List
                            5. Exit
                            """);
            System.out.print("Enter command: ");
            char input = scan.next().charAt(0);

            switch (input) {
                case '1' -> {
                    System.out.println
                            ("""
                                    Choose a Device:
                                    1. Lights
                                    2. Television
                                    3. Thermostats
                                    """);
                    System.out.print("Enter command: ");
                    input = scan.nextLine().charAt(0);

                    System.out.print("Enter Name for new Device: ");
                    String name = scan.nextLine();

                    switch (input) {
                        case '1' -> cp.add(new Lights(name));
                        case '2' -> cp.add(new Television(name));
                        case '3' -> cp.add(new ThermoStat(name));
                    }
                }
                case '2' -> {
                    cp.list();
                    System.out.print("Select a Device [i]: ");
                    int selectedDevice = scan.nextInt();

                    boolean loop2 = true;
                    while (loop2) {
                        System.out.println("""
                            List of Commands:
                            1. Turn on
                            2. Turn off""");

                        String deviceType = cp.getDevice(selectedDevice).getClass().getSimpleName();
                        switch (deviceType) {
                            case "Lights" -> {
                                System.out.println
                                        (""" 
                                            3. Increase Brightness
                                            4. Decrease Brightness
                                            """);

                            }
                            case "Television" -> {
                                System.out.println("""
                                    3. Next Channel
                                    4. Previous Channel
                                    5. Volume Up
                                    6. Volume Down
                                    """);
                            }
                            case "Thermostat" -> {
                                System.out.println("""
                                    3. Increase Temperature
                                    4. Decrease Temperature
                                    """);
                            }
                        }
                        System.out.println("x. exit");
                        System.out.println("Enter command: ");
                        switch (Character.toLowerCase(scan.next().charAt(0))) {

                            case '1' -> {
                                switch(deviceType) {
                                    case "Lights" -> ((Lights) cp.getDevice(selectedDevice)).powerON();
                                    case "Television" -> ((Television) cp.getDevice(selectedDevice)).powerON();
                                    case "ThrmoStat" -> ((ThermoStat) cp.getDevice(selectedDevice)).powerON();
                                }
                            }case '2' -> {
                                switch(deviceType) {
                                    case "Lights" -> ((Lights) cp.getDevice(selectedDevice)).powerOFF();
                                    case "Television" -> ((Television) cp.getDevice(selectedDevice)).powerOFF();
                                    case "ThrmoStat" -> ((ThermoStat) cp.getDevice(selectedDevice)).powerOFF();
                                }
                            }case '3' -> {
                                switch(deviceType) {
                                    case "Lights" -> ((Lights) cp.getDevice(selectedDevice)).increaseBrightness();
                                    case "Television" -> ((Television) cp.getDevice(selectedDevice)).nextChannel();
                                    case "ThrmoStat" -> ((ThermoStat) cp.getDevice(selectedDevice)).increase();
                                }
                            }case '4' -> {
                                switch(deviceType) {
                                    case "Lights" -> ((Lights) cp.getDevice(selectedDevice)).decreaseBrightness();
                                    case "Television" -> ((Television) cp.getDevice(selectedDevice)).prevChannel();
                                    case "ThrmoStat" -> ((ThermoStat) cp.getDevice(selectedDevice)).decrease();
                                }
                            }case '5' -> {
                                if (deviceType.equals("Television")) {
                                    ((Television) cp.getDevice(selectedDevice)).volumeUP();
                                }
                            }case '6' -> {
                                if (deviceType.equals("Television")) {
                                    ((Television) cp.getDevice(selectedDevice)).volumeDOWN();
                                }
                            }
                            case 'x' -> loop2 = false;
                        }
                    }
                }
            case '5' -> loop = false;
            }
        }
    }
}
