package day09_scanner;

import java.util.Scanner;

public class scanner5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a number");
        int number = sc.nextInt();
        boolean even = number % 2 == 0;
        boolean odd = number % 2 != 0;
        System.out.println(even);
        System.out.println(odd);
    }
}
