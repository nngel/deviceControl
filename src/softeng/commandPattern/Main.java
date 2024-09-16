package softeng.commandPattern;

import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Lights light = new Lights(); // Done
        Television tv = new Television(); // Done

        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("i for increase, d for decrease, 0 for 0ff, 1 for on");
            char in = scan.nextLine().charAt(0);

            System.out.println();

            switch(in) {
                case 'i' -> light.increaseBrightness();
                case 'd' -> light.decreaseBrightness();
                case '0' -> light.powerOFF();
                case '1' -> light.powerON();
            }
        }

        /*
        System.out.println("q for vol+, w for vol-, a for ch+, s for ch-, 0 for off, 1 for on");
            System.out.print("Enter command: ");
            char in = scan.next().charAt(0);

            System.out.println();

            switch (in) {
                case 'q' -> tv.volumeUP();
                case 'w' -> tv.volumeDOWN();
                case 'a' -> tv.nextChannel();
                case 's' -> tv.prevChannel();
                case '0' -> tv.powerOFF();
                case '1' -> tv.powerON();
            }
         */

    }
}
