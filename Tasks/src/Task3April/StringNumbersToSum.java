package Task3April;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumbersToSum {

    public static ArrayList<Integer> SumOfNumber(ArrayList<String> strNumbers){
          ArrayList<Integer> numberArray = new ArrayList<>();
        for(String each:strNumbers){
            int total=0;
            int number =  Integer.parseInt(each);

            while(number!=0){

                total = total+number%10;
                number = number/10;
            }
            numberArray.add(total);
        }
 return numberArray;
    }

    public static void main(String[] args) {
         ArrayList<String> strNumbers = new ArrayList<>(Arrays.asList("123","34","513"));
        System.out.println(SumOfNumber(strNumbers));
    }
}
