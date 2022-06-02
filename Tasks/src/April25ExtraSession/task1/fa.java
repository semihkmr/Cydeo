package April25ExtraSession.task1;

import java.util.Arrays;
import java.util.Scanner;

public class fa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length");
        int num = input.nextInt();
        int[] original = new int [num];
        int[] reverse = new int [num];
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < original.length; i++) {
            System.out.println("Enter number");
            original[i] = input.nextInt();
            count1++;
        }
        for (int j=original.length-1; j>=0; j--){
            reverse[count] = original[j];
            count++;
        }
        System.out.println(Arrays.toString(reverse));
    }
}

