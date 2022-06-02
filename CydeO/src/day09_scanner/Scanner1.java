package day09_scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int price;

        System.out.println("Please enter the price for the product");
        price = sc.nextInt();

        int quantity;
        System.out.println("Pleae enter the total number of product");
        quantity = sc.nextInt();

        int revenue = price * quantity;
        System.out.println("Today we made $" + revenue);


    }
}
