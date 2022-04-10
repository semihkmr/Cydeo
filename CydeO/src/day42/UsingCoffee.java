package day42;

public class UsingCoffee {

    public static void main(String[] args) {

        Coffee coffee1 = new Coffee();
        coffee1.brand = "Starbucks";
        coffee1.price = 3.99;
        coffee1.size = 4;
        coffee1.type = "Americano";

        System.out.println(coffee1);

        coffee1.drink();

        coffee1.refill(2);


    }
}
