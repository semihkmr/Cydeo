package Task30March;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static int CountWord(ArrayList<String> arr){

        int count = 0;
        for (int i = 0; i <arr.size() ; i++) {
          String str = arr.get(i);
          if(str.equalsIgnoreCase("java")){
              count++;
          }

        }return  count;

    }



    public static void main(String[] args) {

        String arr1[] = {"java","html","css","java","javascript","selenium"};

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(arr1));

        System.out.println(CountWord(arr));


    }
}
