package Vesa3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    /*
    1) String - Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
 sort the individual string and append them back together. Ex:
Input:  "DC501GCCCA098911"
Output: "CD015ACCCG011899"
     */

        public static String sortLettersAndNumbers(String str){
           String result = "";
           String sortDigit = "";
           String sortLetter = "";
            for (int i = 0; i < str.length(); i++) {
               // String sortList = "";

                char charachter = str.charAt(i);
                if(Character.isDigit(charachter)){
                     sortDigit += str.charAt(i);} // 5
                     if(!Character.isDigit(charachter)|| i == str.length()-1){
                String[] arr = sortDigit.split("");
                Arrays.sort(arr);
                    for (int j = 0; j < arr.length ; j++) {
                       // sortList += arr[j];
                        result += arr[j];
                        sortDigit = "";
                    }}
                if(Character.isLetter(charachter)){

                   sortLetter += str.charAt(i); //DC
                }
                if(!Character.isLetter(charachter)|| i == str.length()-1){
                    String[] arr = sortLetter.split("");
                    Arrays.sort(arr);
                    for (int j = 0; j <arr.length ; j++) {
                      //  sortLetter += arr[j];
                        result += arr[j];
                        sortLetter = "";
                    }
                }


            }



            return result;
    }

    public static void main(String[] args) {


        System.out.println("sortLettersAndNumbers(\"DC501GCCCA098911AVSB\") = " + sortLettersAndNumbers("DC501GCCCA098911AVSB"));
    }


}
