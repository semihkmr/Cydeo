package Task29March;

import java.util.ArrayList;

public class ArrayListChar {
    public static void main(String[] args) {
        ArrayList<Character> arr =new ArrayList<>();
        char letter ='A';
        for (int i = 0; i < 26 ; i++) {

            arr.add(i,letter);
            letter++;
        }
        System.out.println(arr);
    }
}
