package Vesa3;

import java.util.Collection;

public class Task3 {

    /*
    3) String - sum of digits in a string
Write a method that can return the sum of the digits in a string
     */

    public static int sumOfDigits(String str){

        int sum = 0 ;
        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(str.charAt(i)+"");
            }
        }
return sum;
    }

    public static void main(String[] args) {

        System.out.println("sumOfDigits(\"err12314\") = " + sumOfDigits("err12314"));
    }
}
