package day26;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {

        String [] cities = {"adana","istanbul", "ankara","izmir" };

        System.out.println(cities[3]);

        System.out.println(Arrays.toString(cities).substring(1,Arrays.toString(cities).length()-1));
    }
}
