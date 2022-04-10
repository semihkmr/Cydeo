package day37;

import java.util.Arrays;

public class GoogleSearch {
    public static void main(String[] args) {
        String result = "About 2,550,000,000 results (1.00 seconds)";

        String [] arr = result.split(" ");
        System.out.println(Arrays.toString(arr));

        String resultStr = arr[1].replace(",","");
        String timesStr = arr[3].substring(1);

        System.out.println(resultStr);
        System.out.println(timesStr);

        long resultNumber = Long.parseLong(resultStr);
        double timeNumber = Double.parseDouble(timesStr);
        if(resultNumber>=0){
            System.out.println("TEST CASE PASSED-POSITIVE NUMBER");
        }
        if(timeNumber <=2 && timeNumber >= 0){
            System.out.println("TEST CASE PASSED- Under 2 seconds");
        }
    }
}
