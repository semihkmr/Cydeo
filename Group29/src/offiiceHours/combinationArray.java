package offiiceHours;

import java.util.Arrays;

public class combinationArray {
    public static void combinationArr(int[] arr, int[]arr2){
        int [] arrCombination = new int[(arr.length+arr2.length)];
         int j=0;
        for (int i = 0; i <arr.length ; i++) {
            arrCombination[i] = arr[i];
        }
        for (int i = arr.length; i < arrCombination.length; i++) {
            arrCombination[i] = arr2[j];
            j++;

        }
        System.out.println(Arrays.toString(arrCombination));

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        combinationArr(arr,arr2);
    }
}
