package day47;

public class Computer {

    String brand;
    double price;
    String color;

    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    static {

        System.out.println("Static block run");
        hasBattery = true;
        hasMemory = true;
        hasScreen = false;

    }

    public Computer(String brand, double price, String color) {
        System.out.println("Constructor run");
        this.brand = brand;
        this.price = price;
        this.color = color;
    }
}
