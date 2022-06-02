package day45;

import java.util.Arrays;

public class UsingFood {

    public static void main(String[] args) {

        Food apples = new Food("Apples");

        Food chips = new Food("Lays",2);

        Food chicken = new Food("Chicken",1,5.99);

        Food fish = new Food("Fish",4,3.55);


        apples.quantity = 10;
        apples.unitPrice = 1.99;
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println(apples.totalPrice);

        System.out.println();

        String [] strs = {"one", "two", "three"}; // not doing anything with this array, just a reference to see we have worked with object types with arrays

        Food [] allFood = {apples, chips, chicken, null}; // = new Food[4]
        System.out.println(allFood[2]);


        allFood[3] = new Food("Fish", 4, 3.55); // making a new Food object assigning it into the array in index 3
        System.out.println();
        System.out.println(Arrays.toString(allFood)); // print all the whole array of Food objects

        // calculate the total price of the shopping list
        System.out.println();
        double totalPriceAll = 0;

        for(Food each : allFood){ // each == allFood[i]  // why is Food the first thing in the for each - it is the datatype of each element
            System.out.println(each); // extra line just to see each Food object, each iteration
            totalPriceAll += each.totalPrice; // takes the Food object's total price instance variable value
        }
        System.out.println(totalPriceAll);


    }
}
