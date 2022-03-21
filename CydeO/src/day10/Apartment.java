package day10;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        String address, owner, phonenumber;
        int numberOfUnits, monthlyRent, numberOfWasher, numberofstarreviews, numberOfFloors;
        double avgSizeUnit, leaseOfYear, totalNumberOfResidents;
        boolean pool, basement, availableUnit, airconditioning, wheelChairAccess, allowspet;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your address");
        address = sc.nextLine();
        System.out.println("Please enter the name of the owner");
        owner = sc.nextLine();
        System.out.println("Please enter phone number");
        phonenumber = sc.nextLine();
        System.out.println("please enter the number of units");
        numberOfUnits = sc.nextInt();
        System.out.println("please enter monthly rent");
        monthlyRent = sc.nextInt();


    }
}
