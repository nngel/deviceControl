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
        for (Device device : devices) {
            System.out.println(device.getName());
        }
    }
}
