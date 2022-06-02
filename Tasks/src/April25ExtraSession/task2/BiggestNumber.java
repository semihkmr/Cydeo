package April25ExtraSession.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static java.util.Arrays.sort;

public class BiggestNumber {


    public static int biggest4thNumber(int[] arr){

        int [] reverseArr = new int[arr.length];
        sort(arr);
        for (int i = arr.length-1 , j=0 ; i >= 0 ; i--,j++) {

            reverseArr[j] = arr[i];

        }
        return reverseArr[3];
    }

    public static void main(String[] args) {

        int[] arr = {2 , 56 , 0 , 25 , 1 , 75 , 9 , 8};
        int[] arr2 = {1,2,3,9,0};

        System.out.println(biggest4thNumber(arr));
        System.out.println(biggest4thNumber(arr2));
    }



}
