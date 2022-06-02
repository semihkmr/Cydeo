package Vesa4;

import java.util.Arrays;

public class Task3 {

    /*
    3) Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void movesZero(int[] arr){

        int[] result = new int[arr.length];

        for (int i = 0 , j=0 ; i < arr.length ; i++) {
            if(arr[i] == 0){
                continue;
            }
            else {
                result[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {

        int [] arr = {1,0,2,0,3,0,4,0};

        movesZero(arr);
    }
}
