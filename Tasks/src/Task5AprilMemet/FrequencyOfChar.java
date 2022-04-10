package Task5AprilMemet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AABBCCDDEE";

        String[] strArray = str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArray));
        String returnstr= "";
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
          if(!returnstr.contains(list.get(i))) {
              returnstr += list.get(i) + count;
          }
        }
        System.out.println(returnstr);
    }
}

