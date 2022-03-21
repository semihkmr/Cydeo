package task19March;

import java.util.Arrays;

public class oneTo100 {
    public static void main(String[] args) {
        int[][] arr = new  int[10][10];
        int count =1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=count;
                count++;

            }

        }
        System.out.println(Arrays.deepToString(arr));
    }
}
