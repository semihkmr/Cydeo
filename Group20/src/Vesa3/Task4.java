package Vesa3;

import java.util.Arrays;

public class Task4 {
    /*
    4) Array - Find Maximum & Find Minimum
Write a method that can find the maximum number from an int Array
Write a method that can find the maximum number from an int Array
     */

    public static int findMin(int[] arr){
        Arrays.sort(arr);

        return  arr[0];

    }
    public static int findMax(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static void main(String[] args) {

        System.out.println("findMax(new int[]{1, 2, 3, 4}) = " + findMax(new int[]{1,5,6,3,4}));
        System.out.println("findMax(new int[]{1, 2, 3, 4}) = " + findMin(new int[]{1,5,6,3,4}));

    }
}
