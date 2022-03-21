package day18;
import java.util.Locale;
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your address");
        String address = sc.nextLine().toLowerCase(Locale.ROOT).trim();

        boolean drive = address.contains("drive");

        boolean lane = address.contains("lane");
        boolean avenue = address.contains("avenue");
        if (drive) {
            if (address.contains("500")) {
                System.out.println(address + "\n house on the right side\nhouse on drive");
            } else {
                System.out.println(address + "\n house on the left side\nhouse on drive");
            }
        }
        if (lane) {
            if (address.contains("500")) {
                System.out.println(address + "\n house on the right side\nhouse on drive");
            } else {
                System.out.println(address + "\n house on the left side\nhouse on drive");

            }

        }
        if (avenue) {
            if (address.contains("500")) {
                System.out.println(address + "\n house on the right side\nhouse on drive");
            } else {
                System.out.println(address + "\n house on the left side\nhouse on drive");
            }
        }
    }
}