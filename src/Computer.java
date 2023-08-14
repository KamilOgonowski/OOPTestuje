import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;

    private Drive drive;
    private HeadPhones headphones;

    List<USBDevice> usbDevices =  new ArrayList<>();


    public Computer(Monitor monitor, Drive drive)  {
        this.monitor = monitor;
        this.drive = drive;
    }

    public void setHeadphones(HeadPhones headphones) {
        this.headphones = headphones;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public HeadPhones getHeadphones() {
        return headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }
}
