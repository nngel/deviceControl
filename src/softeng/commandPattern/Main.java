package softeng.commandPattern;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        ControlPanel cp = new ControlPanel();
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println
                    ("""
                     Menu:
                     1. Add Device
                     2. Select Device
                     3. Device Commands
                     4. Show Commands
                     """);
            System.out.print("Enter command: ");
            char input = scan.nextLine().charAt(0);

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
                    System.out.println("soon");
                }
                case '3' -> {
                    System.out.println("soon 2");
                }
                case '4' -> cp.list();
            }
        }

    }
}
