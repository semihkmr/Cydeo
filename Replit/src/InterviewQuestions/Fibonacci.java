package InterviewQuestions;

import java.util.Arrays;

public class Fibonacci {
    /*
         Create a method that will give you the Fibonacci numbers up to the x value.
      Where x is the given parameter.Fibonacci is a sequence of number starting from 0, 1 where
      the following numbers are the sum of the previous 2 numbers
       Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc
       Ex:        Input:            8        Output:            0, 1, 1, 2, 3, 5, 8, 13, 21
*/

    public static String fibonacci(int number){

        int [] arr = new int[number+1];
        int arrNumber = 1;
        arr[0] = 0;

        for (int i = 1; i < number+1 ; i++) {
            arr[i] = arrNumber;
            arrNumber += arr[i-1];
        }
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }
}
