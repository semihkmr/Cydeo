package Task3April;

import day40.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseAll {
    public static ArrayList<String> reverseAll(ArrayList<String> list) {

        ArrayList<String> reverse = new ArrayList<>();

        for (String each : list) {

            reverse.add(StringUtil.reverse(each));
        }
        return reverse;
    }

    public static void main(String[] args) {

        String[] strArr = {"ted", "talk", "learn"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));

        System.out.println(reverseAll(list));

        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));

    }

}