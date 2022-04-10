package Task5AprilMemet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LovelyNumber {
    public static Boolean lovelyNumber(int number){

        //int i2 = Integer.valueOf(s);

        String str = String.valueOf(number);

        String[] strArray = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArray));

        for (int i = 0; i < list.size() ; i++) {
            int count = Collections.frequency(list, list.get(i));
            if (count >= 3) {
                return false;
            }
        }
 return true;
    }

    public static void main(String[] args) {
        System.out.println(lovelyNumber(121));
    }
}
