package day09_scanner;

import java.util.Scanner;

public class scanner6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter your salary");
        double salary = sc.nextDouble();
        System.out.println("how many hours you work in a week");
        int hours = sc.nextInt();
        double hourlyrate = salary / (hours * 52);
        System.out.println(hourlyrate);
    }
}
