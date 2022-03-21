package day18;

import java.util.Locale;

public class UpperandLower {
    public static void main(String[] args) {
        String str ="sNOw";
        System.out.println(str.toUpperCase(Locale.ROOT));

        System.out.println(str.toLowerCase(Locale.ROOT));
        System.out.println(str);
    String word = "HELLO";
    word = word.toLowerCase(Locale.ROOT); // makes it lower case for all character, gives you back String
        System.out.println(word);


    }
}
