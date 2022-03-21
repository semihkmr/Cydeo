package day32;

import java.util.Arrays;

public class task1 {

    public static void main(String[] args) {


        int[][] arr = {

                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        for (int [] each : arr){
            System.out.println(Arrays.toString(each));

            double sum =0;

            for(int nums : each){
                System.out.println(nums);
                sum += nums;
            }
            System.out.println(Arrays.toString(each) + "the average is: " + sum/each.length);
        }

    }

}
