package ArrayHard;

import java.util.Arrays;

public class fix34withArray {

    public static void main(String[] args) {
        int[] arr2 = {1,3,1,4,4,3,1};

        int[] newArr = new int[arr2.length];

        for (int i = 0; i <arr2.length ; i++) {

             if(arr2[i]==3){
                 newArr[i] = arr2[i];
                 newArr[i+1] = 4;
             }



        }
        System.out.println(Arrays.toString(newArr));
    }
}
