package softeng.commandPattern;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        ControlPanel cp = new ControlPanel();
        cp.add(new Television("Tv1"));
        cp.add(new Lights("Lights1"));
        cp.add(new ThermoStat("Thermostat"));
        cp.add(new Television("Tv2"));


        cp.list();
    }
}
