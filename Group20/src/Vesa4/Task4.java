package Vesa4;

import java.util.Arrays;

public class Task4 {

    /*
    4) Array - Concat two arrays
Write a return method that can concate two arrays


     */
    public static void concatArrays(int[]arr, int[]arr2){

        int [] result = new int[arr.length+ arr2.length];
        for (int i = 0; i < arr.length ; i++) {
            result[i] = arr[i];
        }
        for (int i = arr.length, j=0; i < arr.length+arr2.length ; i++) {
            result[i] = arr2[j];
            j++;

        }
        System.out.println(Arrays.toString(result));


    }

    public static void main(String[] args) {

        int[] arr = {1,2,4,5};
        int[] arr2 = { 3,4,51,2};

        concatArrays(arr,arr2);
    }
}
