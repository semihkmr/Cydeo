package task19March;

import java.util.Arrays;

public class multiple {
    public static void main(String[] args) {
        int[][] firstArray = {{1,2,3},{2,5,10},{0,3,20}};
        int[][] secondArray={{10,4,3},{5,2,7},{100,20,5}};

        int[][] multipleArray= new int[3][3];

        for (int i = 0; i <firstArray.length ; i++) {
            for (int j = 0; j <firstArray[i].length ; j++) {
                multipleArray[i][j] = firstArray[i][j]* secondArray[i][j];

            }

        }
        System.out.println(Arrays.deepToString(multipleArray));


    }
}
