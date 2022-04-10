package Task3April;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    public static ArrayList<String> RemoveCountries(ArrayList<String> strArr, int length) {

        strArr.removeIf(country -> country.length() > length);
        return strArr;
    }

    public static void main(String[] args) {
        String[] list = {"Japan", "Korea", "United States", "Turkey", "United Kingdom",
                "Canada"};
        int length = 7;
        ArrayList<String> strArr = new ArrayList<>(Arrays.asList(list));
        System.out.println(RemoveCountries(strArr, length));
    }
}