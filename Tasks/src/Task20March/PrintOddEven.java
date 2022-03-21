package Task20March;

import java.util.Arrays;

public class PrintOddEven {
    public static void printOddEven(int[] arr){

        int countEven=0;
        int countOdd=0;
         for (int i = 0; i <arr.length ; i++) {
            if(arr[i]%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
         }
         int[] innerArr = {countEven,countOdd};
        System.out.println(Arrays.toString(innerArr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,234,14,1412,4};
        printOddEven(arr);
    }

}
