package May28.task1;

import java.util.*;

public class UseFunction {


    public static void main(String[] args) {

     ListFunction<Integer, Integer> maxNumberFromList = a -> {

          Collections.sort(a);

          Integer max = a.get(a.size()-1);



         return max;

     };

     ListFunction<Integer, Integer> minNumberFromList = a -> {

         Collections.sort(a);

         Integer min = a.get(0);

         return min;
     };

     ListFunction< String, String>  longestString = str ->{

         String longest = "";
       for ( String each: str){
          if(each.length() > longest.length()){
              longest = each;
          }
       }
return longest;
     };

     ListFunction<String, String> shortestString = str -> {

        String shortest = str.get(0);
        for (String each : str){
            if(each.length() < shortest.length()){
                shortest = each;
            }
        }
        return shortest;
     };

     ListFunction<Integer , int[] > integerToArr = a -> {

        int [] arr =new int[a.size()];

         for (int i = 0; i < a.size() ; i++) {

             arr[i] = a.get(i);
         }

       return arr;
     };

     ListFunction<Double , double[]> doubleToArr = a -> {

         double[] arr = new double[a.size()];

         for (int i = 0; i < a.size(); i++) {

             arr[i] = a.get(i);
         }
         return arr;
     };

        System.out.println(maxNumberFromList.apply(Arrays.asList(1, 23, 4, 51, 31, 2131)));
        System.out.println(minNumberFromList.apply(Arrays.asList(1, 23, 4, 51, 32, 2131)));
        System.out.println(shortestString.apply(Arrays.asList("semih", "hajad", "james", "sdet")));
        System.out.println(longestString.apply(Arrays.asList("semih", "had", "jame", "sdet")));
        System.out.println(Arrays.toString(integerToArr.apply(Arrays.asList(1, 4, 231, 312))));
        System.out.println(Arrays.toString(doubleToArr.apply(Arrays.asList(1.0, 2.1, 3.2, 4.4))));
    }



}
