package April15;

public class UsingComputer {

    public static void main(String[] args) {
        Computer computer1 = new Computer(999.99,"apple","white");
        Computer computer2 = new Computer(899.99,"asus","black");

        System.out.println(computer1);
        System.out.println(computer2);

        System.out.println("Has Screen "+ Computer.hasScreen);
        System.out.println("Has battery " + Computer.hasBattery);
        System.out.println("Has memeory " + Computer.hasMemory);
    }




}
