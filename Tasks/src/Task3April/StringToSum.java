package Task3April;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToSum {

    public static ArrayList<Integer> sumFromString(ArrayList<String> list){

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list){

            int currentSum = getCurrentSum(each);
            sums.add(currentSum);
        }return sums;
    }

    public static int getCurrentSum(String each) {
        int currentSum=0;

        for(String eachDigit : each.split("")){

            currentSum+=Integer.parseInt(eachDigit);

        }
        return currentSum;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123","1111","34"));
        System.out.println(sumFromString(list));
    }
}
