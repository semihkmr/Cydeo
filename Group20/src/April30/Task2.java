package April30;

import java.util.Arrays;

public class Task2 {
    /*
    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public static int[] Reverse(int[] arr){

        int [] reverse = new int[arr.length];

        for (int i = arr.length -1 , j=0 ; i >=0 ; i--, j++) {

            reverse[j] = arr[i];

        }
        return reverse;
    }

    public static void main(String[] args) {

        int[] arr = {5,11,9};

        System.out.println(Arrays.toString(Reverse(arr)));
    }
}
