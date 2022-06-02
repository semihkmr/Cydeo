package April15;

public class Computer {

    double price;
    String brand;
    String color;

    static boolean hasScreen, hasBattery, hasMemory;
    static {
        hasScreen = true;
        hasBattery = false;
        hasMemory = false;

    }
    public Computer(double price, String brand, String color){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
