package Extra.statik.computer;

public class Computer {

  public double price;
  public  String brand;
  public  String color;

  public static boolean hasScreen;
  public static boolean hasBattery;
  public static boolean hasMemory;

  static{
      hasScreen = true;
      hasBattery = true;
      hasMemory = false;
      System.out.println("Static block running");
  }



}
