package Task28MarchMemet;

import java.util.Arrays;

public class Fibonacci {
    public static String finbonacci(int number){
        int [] arr = new int[number];
        int arrNumber= 1;
        arr[0] = 0;
        for (int i = 1; i < number ; i++) {
           arr[i] = arrNumber;
           arrNumber+=arr[i-1];
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println(finbonacci(8));
    }
}
