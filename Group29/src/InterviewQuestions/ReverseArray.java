package InterviewQuestions;

import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int j = arr.length-1;

        int[] reverseArr = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            reverseArr[j] = arr[i];
            j--;
        }
        System.out.println(Arrays.toString(reverseArr));
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        reverseArray(arr);
    }
}
