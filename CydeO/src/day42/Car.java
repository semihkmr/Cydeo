package day42;

public class Car {

    String model;
    int year;
    String color;
    int fuel_level;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuel_level=" + fuel_level + (isLow() ? " Tank is low" : " Keep on")+
                '}';
    }
    public void drive(){
        System.out.println("Driving model: " + model);
     fuel_level -= 10;
    }
    public void fillTank() {
        System.out.println("filling tanks");
        fuel_level = 100;
    }
    public boolean isLow(){
        return fuel_level < 25;
    }

}
