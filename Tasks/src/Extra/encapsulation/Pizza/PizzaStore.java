package Extra.encapsulation.Pizza;

import org.w3c.dom.ls.LSOutput;

public class PizzaStore {

    public static void main(String[] args) {


        Pizza obj1  = new Pizza("large",4);
        System.out.println(obj1);
        System.out.println("obj1.calculatePrice() = " + obj1.calculatePrice());

        obj1.setNumberOfToppings(3);
        System.out.println("obj1.calculatePrice() = " + obj1.calculatePrice());


    }


}
