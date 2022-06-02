package April10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "AABCCDDEE";

        String [] arr =str.split("");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        String return1 = "";

        for (int i = 0; i <list.size(); i++) {
           int countChar = 0;
             countChar = Collections.frequency(list,list.get(i));
          if( !return1.contains(list.get(i))){
              return1 += list.get(i)+countChar;
          }
        }
        System.out.println(return1);
    }

    }

