package program;

import program.drive.Drive;
import program.usbdevice.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;

    private Drive drive;
    private HeadPhones headphones;

    private List<USBDevice> usbDevices =  new ArrayList<>();


    public Computer(Monitor monitor, Drive drive)  {
        this.monitor = monitor;
        this.drive = drive;
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

    public void setHeadphones(HeadPhones headphones) {
        this.headphones = headphones;
    }

    public List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice){
        boolean isConnected = usbDevice.connect();

        if(isConnected){
            usbDevices.add(usbDevice);
        }
    }

    public void removeUSBDevice(USBDevice usbDevice){
        boolean isDisconnected = usbDevice.disconnect();

        if(isDisconnected){
            usbDevices.remove(usbDevice);
        }
//        old version below:
//        if (!isDisconnected)
//            System.out.println("Forcibly removed USB Device");
//        usbDevices.remove(usbDevice);
        }
}
