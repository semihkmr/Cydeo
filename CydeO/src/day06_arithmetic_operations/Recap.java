package day06_arithmetic_operations;

public class Recap {

    public static void main(String[] args) {
        String houseType = "Penthouse";
        int numberOfBedrooms = 4;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        boolean hasBasement = false;
        boolean hasAttic = false;
        boolean hasPool = true;
        boolean isOnSale = false;
        double costOfHouse = 1_000_000.99; // 4.5 | 1000000.99
        String address = "129481 Central Park";
        int zipcode = 219124;
        boolean hasPark = true;
        double schoolRating = 4.6;
        String houseInfo = "The " + houseType + " on " + address + ", " + zipcode + " costs $" + costOfHouse + "\nThe " + houseType + " has " + numberOfBedrooms + " bedrooms, " + numberOfBathrooms + " bathrooms, " + numberOfKitchens + " kitchen\nIt also includes a basement: " + hasBasement + ", has an attic: " + hasAttic + ", has a pool: " + hasPool + ", is on sale: " + isOnSale + ", and has a park: " + hasPark + ".\nThe schools in the area have a rating of " + schoolRating;

        System.out.println(houseInfo);

    }
}
