package program;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());


        monitor.setLowResolution();
        System.out.println(monitor.getResolution());
    }
}