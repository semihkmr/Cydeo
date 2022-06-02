package day09_scanner;

import java.util.Scanner;

public class scanner7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter product name");
        String pname = sc.nextLine();

        System.out.println("please enter price");
        double price = sc.nextDouble();

        System.out.println("please enter the quantity");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("please enter full name");
        String fullname = sc.nextLine();

        System.out.println(fullname + " your order for " + quantity + " " + pname + " has been placed. Your total is $" + (price * quantity));
    }
}
