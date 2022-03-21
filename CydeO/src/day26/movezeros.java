package day26;

import java.util.Arrays;

public class movezeros {
    public static void main(String[] args) {
        int [] numbers = {10,0,5,0,1,0};
        int [] move0 = new int[numbers.length];
        int j=0;
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]!=0){
                move0[j] = numbers[i];
                j++;

            }

        }
        System.out.println(Arrays.toString(move0));
    }
}
