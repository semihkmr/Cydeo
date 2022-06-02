package day09_scanner;

import java.util.Scanner;

public class scanner4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter random number");
        int number = sc.nextInt();
        boolean divided2 = number % 2 == 0;
        boolean divided3 = number % 3 == 0;
        boolean divided5 = number % 5 == 0;
        System.out.println(divided2);
        System.out.println(divided3);
        System.out.println(divided5);
    }
}
