package day37;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        numbers.add(100);
        System.out.println(numbers);

        numbers.add(-100);
        System.out.println(numbers);

        numbers.add(23);
        numbers.add(25);
        numbers.add(23);
        System.out.println(numbers);

        numbers.add(1,3);
        System.out.println(numbers);

        System.out.println(numbers.get(1));

        System.out.println(numbers.size());
    }
}
