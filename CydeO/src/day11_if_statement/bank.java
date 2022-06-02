package day11_if_statement;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter number1");
        int number1 = sc.nextInt();

        System.out.println("please enter number2");
        int number2 = sc.nextInt();
        sc.nextLine();
        System.out.println("please type one of the option topla cikar carp bol");
        String islem = sc.nextLine();
        if (islem.equals("topla")) {
            System.out.println(number1 + number2);
        } else if (islem.equals("cikar")) {
            System.out.println(number1 - number2);
        } else if (islem.equals("carp")) {
            System.out.println(number1 * number2);

        } else {
            System.out.println(number1 / number2);
        }

    }
}
