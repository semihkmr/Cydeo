package day29;

import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String str ="Today is Monday";
        String str1 ="monday,tuesday,wednesday,thursday,friday,saturday,sunday";
       String[] words= str.split(" ");
        System.out.println(Arrays.toString(words));

        String days[] = str1.split(",");
        System.out.println(Arrays.toString(days));
        for(String day : days){
            System.out.println(day);
        }

    }
}
