package day53_abstraction.cars;

import day42.Car;

public class Toyota extends Car {
    @Override
    public void start(){
        System.out.println("Insert Key");
        System.out.println("Turn the key");
    }
}
