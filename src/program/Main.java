package program;

import program.drive.HDDDrive;
import program.drive.SSDDrive;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SSDDrive drive = new SSDDrive();
        Computer computer = new Computer(monitor, drive);

        drive.addFile(new File("jnsp.jpg"));
        drive.listFiles();
    }
}