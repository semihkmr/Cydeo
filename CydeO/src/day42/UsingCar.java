package day42;

public class UsingCar {

    public static void main(String[] args) {

        Car car1 = new Car() {
            @Override
            public void start() {

            }
        };
        car1.model = "Mercedes";
        car1.year = 2020;
        car1.color = "Black";
        car1.fuel_level = 50;

        System.out.println(car1);
        car1.drive();
        car1.drive();
        car1.drive();
        car1.drive();
        System.out.println(car1);
        car1.fillTank();
        System.out.println(car1);

    }

}
