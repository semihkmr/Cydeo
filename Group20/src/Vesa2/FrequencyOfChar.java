package Vesa2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChar {
    /*
    Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static String frequencyOfChar(String str){

        String[] arr = str.split("");
        String result = "";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i <list.size() ; i++) {
          int count = 0;
             count  = Collections.frequency(list,list.get(i));
             if(!result.contains(list.get(i))){
                 result += arr[i]+count;
             }

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println("FrequencyOfChar(\"AAABBCDD\") = " + frequencyOfChar("AAABBCDDE"));
    }


}
