package program;

import program.drive.SSDDrive;
import program.file.File;
import program.usbdevice.MemoryStick;
import program.usbdevice.Mouse;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Mouse mouse = new Mouse("Logitech");
        MemoryStick memoryStick = new MemoryStick("Pendrive");

//        USBDevice mouse = new Mouse("Logitech");
//        USBDevice memoryStick = new MemoryStick("Pendrive");

        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("jnsp.jpg"));
        drive.listFiles();

        computer.addUSBDevice(memoryStick);
//        computer.addUSBDevice(mouse);
        memoryStick.eject();


        computer.removeUSBDevice(memoryStick);
//        computer.removeUSBDevice(mouse);
    }
}