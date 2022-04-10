package Task31March;

import java.util.ArrayList;
import java.util.Arrays;

public class Targetword {
    /*

    Target word
Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
Ex:
Input:
”java”, ”html”, “css”, “java”, “javascript”, “selenium”
Target: java
Output:
2
     */
        public static int CountWord(ArrayList<String> strArray){

          int count = 0;
            for (int i = 0; i < strArray.size() ; i++) {

                String str = strArray.get(i);
                if(str.equalsIgnoreCase("java")){
                    count++;
                }

            }
            return count;
        }

    public static void main(String[] args) {
        String[] arr = {"java","html","css","java","javascript","selenium"};

        ArrayList<String> strArray = new ArrayList<>(Arrays.asList(arr));

        System.out.println(CountWord(strArray));

    }


}
