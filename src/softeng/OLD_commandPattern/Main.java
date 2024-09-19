package softeng.OLD_commandPattern;

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
            System.out.println();
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
                    input = scan.next().charAt(0);
                    scan.nextLine();

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

                    if(scan.hasNextInt())
                    {
                        int selectedDevice = scan.nextInt();

                        if(selectedDevice >= cp.size() || selectedDevice < 0)
                        {
                            System.out.println("[c] Invalid Device");
                        }
                        else
                        {
                            Device d1 = cp.getDevice(selectedDevice);

                            boolean loop2 = true;
                            while (loop2) {
                                d1.showInfo();
                                System.out.println("Command List:\n" + d1.commandList() + "\n" + "x. exit");
                                System.out.print("Enter command: ");
                                char command = Character.toLowerCase(scan.next().charAt(0));

                                if (Character.isDigit(command)) {
                                    d1.commandCode(Integer.parseInt(String.valueOf(command)));
                                }
                                else if (command == 'x') {
                                    loop2 = false;
                                }
                            }
                        }
                    }
                    else {
                        scan.next();
                        System.out.println("[c] Invalid Command");
                    }
                }
                case '3' -> cp.list();
                case '5' -> loop = false;
            }
        }

        System.out.println("Programmer: Edward Angel Lorica");
    }
}
