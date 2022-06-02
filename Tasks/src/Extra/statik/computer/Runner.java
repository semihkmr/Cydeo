package Extra.statik.computer;

public class Runner {

    public static void main(String[] args) {

        Computer obj1 = new Computer();

        obj1.brand = "Asus";
        obj1.color = "Black";
        obj1.price = 999.99;

        System.out.println("obj1.price = " + obj1.price);
        System.out.println("obj1.color = " + obj1.color);
        System.out.println("obj1.brand = " + obj1.brand);

        System.out.println("Computer.hasBattery = " + Computer.hasBattery);
        System.out.println("Computer.hasMemory = " + Computer.hasMemory);
        System.out.println("Computer.hasScreen = " + Computer.hasScreen);

    }


}
