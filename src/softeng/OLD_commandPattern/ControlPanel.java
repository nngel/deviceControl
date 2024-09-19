package softeng.OLD_commandPattern;

import java.util.LinkedList;

public class ControlPanel {

    LinkedList<Device> devices;

    public ControlPanel() {
        devices = new LinkedList<>();
    }

    public void add(Device device) {
        devices.add(device);
    }

    public int size() {
        return devices.size();
    }

    public Device getDevice(int index) {
        return devices.get(index);
    }
    public void list()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(
                """
                i\tDevice Type\t\tPower State\t\tDevice Name
                ----------------------------------------
                """);
        for (Device device : devices) {
            sb.append(devices.indexOf(device))
                    .append("\t")
                    .append(device.getClass().getSimpleName())
                    .append((device.getClass().getSimpleName().equalsIgnoreCase("Lights") ? "\t" : ""))
                    .append("\t\t")
                    .append(device.getPower() ? "Power On" : "Power Off")
                    .append("\t\t")
                    .append(device.getName())
                    .append("\n");
        }
        System.out.println(sb);
    }
}

// nngel
