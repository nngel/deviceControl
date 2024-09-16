package softeng.commandPattern;

import java.util.LinkedList;

public class ControlPanel {

    LinkedList<Device> devices;

    public ControlPanel() {
        devices = new LinkedList<>();
    }

    public void add(Device device) {
        devices.add(device);
    }

    public void list()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(
                """
                i\tDevice Type\t\tDevice Name
                ----------------------------------------
                """);
        for (Device device : devices) {
            sb.append(devices.indexOf(device)).append("\t").append(device.getClass().getSimpleName()).append("\t\t").append(device.getName()).append("\n");
        }
        System.out.println(sb.toString());
    }
}
