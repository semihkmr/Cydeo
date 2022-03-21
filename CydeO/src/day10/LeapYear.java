package day10;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter the year");
        int year = sc.nextInt();

        boolean Leapyear = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0);
        System.out.println(Leapyear);
// input.Next()  gives you String, but just a one word

        // input.NextLine() gives you String, but multiple
        // Whenever we use nextLine() method after any other Scanner methods,  the input is consumed by the enter from the previous input.
        // solution : add a NextLine() just to handle the enter input, then you can use nextLine()


    }
}
