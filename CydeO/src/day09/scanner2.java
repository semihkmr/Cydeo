package day09;

import java.util.Scanner;

public class scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number1;
        System.out.println("please enter angle number1 ");

        number1 = sc.nextDouble();

        double number2;
        System.out.println("pleae enter angle number2");
        number2 = sc.nextDouble();

        double number3;
        System.out.println("please enter angle number3");
        number3 = sc.nextDouble();

        double Totalangle = number1 + number2 + number3;

        if (Totalangle == 180) {
            System.out.println("You have a triangle");
        } else if (Totalangle == 360) {
            System.out.println("You have a circle");

        } else {
            System.out.println("What the hell you have ");
        }
    }


}

