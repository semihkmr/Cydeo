package day34;

import java.util.Scanner;

public class NumberWords {

    public static String numberAsWord(int number){
        if(number<1||number>10){
            return "Invalid number";}



            String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

            return words[number - 1];

        }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(sc.nextInt()));
    }
}
